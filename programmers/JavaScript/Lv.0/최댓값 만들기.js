function solution(numbers) {
  const multipleArr = [];
  for (let i = 0; i < numbers.length; i++) {
    for (let j = i + 1; j < numbers.length; j++) {
      multipleArr.push(numbers[i] * numbers[j]);
    }
  }
  multipleArr.sort((a, b) => a - b);
  return multipleArr[multipleArr.length - 1];
}
