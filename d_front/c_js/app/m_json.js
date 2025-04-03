// json : javascript object notation
// js 객체 문법으로 데이터를 표현하는 문자기반 포멧
// parsing    : 데이터를 읽어서 프로그램에서 사용가능한 형태로 변환
// serialization : 프로그램의 객체, 데이터를 통신가능한 형태로 변환

let top1 = {
  title : '소년이 온다',
  awards : ['노벨문학상', '이상문학상', {cnt:2, year:[2024, 2019]}],
  category : {depth1: '문학', depth2: '소설', code:[12,13]},
  info: function(){
    console.log(this.title);
  }
}

// obj to json
const bookJson = JSON.stringify(top1);
console.log(typeof(bookJson), bookJson);

// json to obj
const bookObj = JSON.parse(bookJson);
console.log(typeof(bookObj), bookObj);

console.log('=============================');
// 2. 구조분해할당
const arr = ['a', 'b', 'c'];
const [a, b, c] = arr;
console.dir(a);
console.dir(b);
console.dir(c);

// let top1 = {
//   title : '소년이 온다',
//   awards : ['노벨문학상', '이상문학상', {cnt:2, year:[2024, 2019]}],
//   category : {depth1: '문학', depth2: '소설', code:[12,13]},
//   info: function(){
//     console.log(this.title);
//   }
// }

const {
  title,
  category:{depth1, depth2, code:[depth1Code, depth2Code]},
  awards:[award1, award2, {cnt, year:[yearA, yearB]}]
} = top1;

console.log(title);
console.log(depth1);
console.log(depth2);
console.log(depth1Code, depth2Code);
console.log(award1, award2);
console.log(cnt, yearA, yearB);













