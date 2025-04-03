const API_URL = 'https://dapi.kakao.com/v2/search/book?';
const API_KEY = 'KakaoAK 39e799bdab4d24a87089b90dbf07f0b4';

const api = async params => {
  const queryString = new URLSearchParams(params).toString();
  const response = await fetch(API_URL+queryString, {
    headers: {Authorization: API_KEY}
  });

  return response.json();
}

export default api;

