const API_URL = 'https://dapi.kakao.com/v3/search/book?';
const params = {
  query: '해리포터',
  size: '2'
}

const queryString = new URLSearchParams(params).toString();

(async () => {
  const response = await fetch(API_URL+queryString, {
    headers: {Authorization: 'KakaoAK b97ae609182be460fa5dcd9f800bf917'}
  });

  const data = await response.json();
  const {
    documents:[{title}]
  } = data;

  console.log(title);
})();


