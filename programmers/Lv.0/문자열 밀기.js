// 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
function solution(A, B) {
  // 한번 미는 함수
  const push = (val) => {
    const object = [];
    let pushStr = "";
    for (let i = 0; i < val.length; i++) {
      object.push([val[i], i]);
    }
    // index를 증가(만약, 마지막 인덱스라면 0으로)
    for (let value of object) {
      if (value[1] === object.length - 1) {
        value[1] = 0;
      } else {
        value[1]++;
      }
    }
    // index를 기준으로 오름차순 정렬
    object.sort((a, b) => a[1] - b[1]);
    // 정렬된 객체에서 문자만 추출하여 문자열로 구성
    for (let value of object) {
      pushStr += value[0];
    }
    return pushStr;
  };
  let result = 0;
  let switchStr = A;
  for (let i = 0; i < A.length; i++) {
    if (switchStr === B) {
      return result;
    } else {
      result++;
      switchStr = push(switchStr);
    }
  }
  if (result === A.length) {
    return -1;
  }
  return result;
}
