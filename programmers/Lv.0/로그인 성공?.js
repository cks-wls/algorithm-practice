// 머쓱이는 프로그래머스에 로그인하려고 합니다. 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때, 다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.
// - 아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다.
// - 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를, 아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다.
function solution(id_pw, db) {
  // id_pw는 사용자가 입력한 이메일, 비밀번호 배열
  // db 회원들의 정보가 담긴 배열(2차원)
  // 아이디와 비밀번호 모두 일치 => "login" 리턴
  // 아이디가 일치하는 회원이 없으면 -> "fail", 아이디는 일치하지만 비밀번호가 다르면 -> wrong pw 리턴
  // -> 최종적인 판단은 어떻게 할지? 배열로 관리?
  // login이 있으면 login 리턴?이런식으로?
  const answer = [];
  for (let i = 0; i < db.length; i++) {
    // 아이디가 일치 하지 않는 경우
    if (id_pw[0] !== db[i][0]) {
      answer.push("fail");
    } else {
      // 모두 일치하는 경우
      if (id_pw[1] === db[i][1]) {
        answer.push("login");
      }
      // 비밀번호만 일치하지 않는 경우
      answer.push("wrong pw");
    }
  }
  if (answer.includes("login")) {
    return "login";
  } else if (answer.includes("wrong pw")) {
    return "wrong pw";
  }
  return "fail";
}
