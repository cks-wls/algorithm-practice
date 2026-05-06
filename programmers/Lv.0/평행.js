// 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.

// [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
// 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

// 제한사항
// dots의 길이 = 4
// dots의 원소는 [x, y] 형태이며 x, y는 정수입니다.
// 0 ≤ x, y ≤ 100
// 서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
// 두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
// 임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.

function solution(dots) {
  // 경우의 수는 3가지. [0][1] / [0][2] / [0][3]
  // 선택을 했을때 남은 것을 어떻게 처리할것인가? -> 먼저 한점을 선택하고 나머지 두 점을 새로운 배열에 Push를 한다.
  // 이후 두개의 기울기를 구하고 일치하는 값이 있다면 1 리턴. 마지막에 0리턴
  for (let i = 1; i < 4; i++) {
    const anotherChoice = [];
    for (let j = 1; j < 4; j++) {
      if (i !== j) {
        anotherChoice.push(dots[j]);
      }
    }
    let firstInclination =
      (dots[0][1] - dots[i][1]) / (dots[0][0] - dots[i][0]);
    let secondInclination =
      (anotherChoice[0][1] - anotherChoice[1][1]) /
      (anotherChoice[0][0] - anotherChoice[1][0]);

    if (firstInclination === secondInclination) {
      return 1;
    }
    console.log(firstInclination, secondInclination);
  }
  return 0;
}
