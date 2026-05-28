// 선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
function solution(lines) {
  // start 점을 기준으로 정렬하기
  lines.sort((a, b) => a[0] - b[0]);
  // 두 선분씩 비교하면서 겹치는 부분을 새로운 배열에 push. 그 배열 내에서도 겹치는 부분이 있다면 (전체 겹치는 부분 - 서로 겹치는 부분)
  const overLapLines = [];
  for (let i = 0; i < lines.length; i++) {
    for (let j = i + 1; j < lines.length; j++) {
      if (lines[i][1] > lines[j][0]) {
        if (lines[j][1] <= lines[i][1]) {
          overLapLines.push([lines[j][0], lines[j][1]]);
        } else {
          overLapLines.push([lines[j][0], lines[i][1]]);
        }
      }
    }
  }
  console.log(overLapLines);
  switch (overLapLines.length) {
    case 0:
      return 0;
      break;
    case 1:
      return overLapLines[0][1] - overLapLines[0][0];
      break;
    case 2:
      if (overLapLines[0][1] > overLapLines[1][0]) {
        return overLapLines[1][1] - overLapLines[0][0];
      } else {
        return (
          overLapLines[0][1] -
          overLapLines[0][0] +
          overLapLines[1][1] -
          overLapLines[1][0]
        );
        break;
      }
    case 3:
      return (
        Math.max(overLapLines[2][1], overLapLines[1][1]) - overLapLines[0][0]
      );
      break;
  }
}
