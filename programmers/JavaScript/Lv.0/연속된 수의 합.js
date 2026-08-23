// 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
function solution(num, total) {
  let middleNumber = Math.floor(total / num);
  let infrontNumberCount = Math.floor(num / 2);
  let evenInfrontNumberCount = Math.floor(num / 2) - 1;
  const answer = [];
  if (num % 2 === 1) {
    // 홀수일때
    for (
      let i = middleNumber - infrontNumberCount;
      i <= middleNumber + infrontNumberCount;
      i++
    ) {
      answer.push(i);
    }
  } else {
    //짝수일
    for (
      let i = middleNumber - evenInfrontNumberCount;
      i <= middleNumber + evenInfrontNumberCount + 1;
      i++
    ) {
      answer.push(i);
    }
  }
  return answer;
}
