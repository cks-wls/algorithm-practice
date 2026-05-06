// 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
function solution(babbling) {
  // aya, ye, woo, ma 네가지 발음을 최대 한번식 사용해 조합한 발음 -> 4가지 단어의 조합으로만 이루어져야함
  // 발음할 수 있는 단어의 배열
  const canSpeakWord = ["aya", "ye", "woo", "ma"];
  // babbling의 각 원소에서 발음할 수 있는 단어의 개수를 모아놓은 배열
  const canSpeakCount = [];
  for (let i = 0; i < babbling.length; i++) {
    let guessLength = 0;
    let count = 0;
    // babbling의 원소의 길이가 2보다 작은 경우 || 10보다 큰 경우는 제외
    if (babbling[i].length < 2 || babbling[i].length > 10) {
      canSpeakCount[i] = 0;
    } else {
      //babbling의 원소에 canSpeakWord가 포함되있으면 guessLength를 해당 문자열의 길이만큼 더함
      // 최종적으로 guessLength와 babbling[i].length가 일치하면 한번씩 등장한것이기때문에 문제의 조건과 일치. -> canSpeakCount[i] = 1값이 됨
      // 일치하지 않으면 조건에 맞지 않기 때문에 canSpeakCount[i] = 0이 된다.
      for (let j = 0; j < 4; j++) {
        if (babbling[i].includes(canSpeakWord[j])) {
          guessLength += canSpeakWord[j].length;
        }
      }
      if (guessLength !== babbling[i].length) {
        canSpeakCount[i] = 0;
      } else {
        canSpeakCount[i] = 1;
      }
    }
  }
  // canSpeakCount의 값들을 모두 더하면 된다.
  let sum = 0;
  canSpeakCount.forEach((num) => (sum += num));
  return sum;
}
