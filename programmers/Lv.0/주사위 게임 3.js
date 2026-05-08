// 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
// - 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
// - 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
// - 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
// - 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
// - 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
// 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
function solution(a, b, c, d) {
  // 주사위 숫자가 모두 p로 같으면 1111 x p점
  // 세개의 숫자가 p로 같고, 나머지 하나가 q라면 (10 x p + q)**2
  // 두개씩 p, q로 같으면 (p+q) x |p-q|
  // 두 수가 p로 같고 나머지 숫자를 p, q라 하면 p x q
  // 모두 다르면 가장 작은 숫자리턴

  // a,b,c,d를 배열 형태로 만듦
  const numberArray = [];
  numberArray.push(a);
  numberArray.push(b);
  numberArray.push(c);
  numberArray.push(d);
  // 나온 눈의 값을 키값으로, 나온 횟수를 value로 갖는 object
  const numberCountObject = {};
  for (let i = 0; i < 4; i++) {
    if (!numberCountObject[numberArray[i]]) {
      numberCountObject[numberArray[i]] = 1;
    } else {
      numberCountObject[numberArray[i]]++;
    }
  }
  const key = [];
  for (let k of Object.keys(numberCountObject)) {
    key.push(Number(k));
  }
  const value = Object.values(numberCountObject);
  switch (key.length) {
    case 1:
      return key[0] * 1111;
      break;
    case 2:
      // 2 2
      if (value[0] === value[1]) {
        return (key[0] + key[1]) * Math.abs(key[0] - key[1]);
      } else {
        // 1 3
        let index = value.indexOf(3);
        if (index === 0) {
          return (10 * key[0] + key[1]) ** 2;
        } else {
          return (10 * key[1] + key[0]) ** 2;
        }
      }
      break;
    case 3:
      // 2 1 1
      let index = value.indexOf(2);
      key.splice(index, 1);
      return key[0] * key[1];

    case 4:
      return Math.min(...key);
      break;
  }
}
