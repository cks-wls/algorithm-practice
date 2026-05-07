// 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
function solution(score) {
  // 점수의 평균으로 등수 메기기
  // 처음에 생각한것 -> index를 key, 평균을 value값으로 갖는 객체를 생성 -> 평균을 내림차순시켜서 등수 구하기-> key값에 맞게 다시 배열
  // 두번째 생각한 것 -> 평균값을 갖는 배열을 생성 -> score.length와 크기가 같은 gradeArray생성(모든 원소는 1로) -> 비교를 통해 등수 조절
  // 평균값을 갖는 배열
  const averageArray = [];
  // 등수를 갖는 배열
  const gradeArray = [];
  for (let i = 0; i < score.length; i++) {
    averageArray.push((score[i][0] + score[i][1]) / 2);
    gradeArray.push(1);
  }

  for (let i = 0; i < averageArray.length; i++) {
    for (let j = i + 1; j < averageArray.length; j++) {
      if (averageArray[i] > averageArray[j]) {
        gradeArray[j] = gradeArray[j] + 1;
      } else if (averageArray[i] < averageArray[j]) {
        gradeArray[i] = gradeArray[i] + 1;
      } else {
        gradeArray[i] = gradeArray[j];
      }
    }
  }
  return gradeArray;
}
