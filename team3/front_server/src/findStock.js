import axios from 'axios'

// var stockLists = {};

// fetch('https://sandbox-apigw.koscom.co.kr/v2/market/stocks'
// + '/kospi/lists'
// + '?apikey=l7xxc460c2c4fca442ebaef0e2d8977dc043',{
//   mode: 'no-cors',
// })
//   .then(res => {
//     stockLists = res.data;
//     console.log(res.data);
//   })
//   .catch(err => {
//     console.log('err', err);
//   })

  // var xhr = new XMLHttpRequest();
  // var url = 'https://sandbox-apigw.koscom.co.kr/v2/market/stocks/{marketcode}/lists'.replace(/{marketcode}/g, encodeURIComponent('kospi'));
  // var queryParams = '?' +  encodeURIComponent('apikey') + '=' + encodeURIComponent('l7xxc460c2c4fca442ebaef0e2d8977dc043');
  // xhr.open('GET', url + queryParams);
  // xhr.onreadystatechange = function () {
  //     if (this.readyState == 4) {
  //         alert('Status: '+this.status+'\nHeaders: '+JSON.stringify(this.getAllResponseHeaders())+'\nBody: '+this.responseText);
  //     }
  // };
  
  // xhr.send('');

const findStock = (x)=>{

   axios.get('/api/stock/code/search/' + x)
          .then(res => {
            return res.isuKorNm;
          })

    // fetch('https://sandbox-apigw.koscom.co.kr/v2/market/stocks'
    // + '/kospi/lists'
    // + '?apikey=l7xxc460c2c4fca442ebaef0e2d8977dc043',{
    //   mode: 'no-cors',
    // })
    //   .then(res => {
    //     const stockLists = res.data;
    //     console.log(res.data);
    //     console.log(stockLists);
    //   })
    //   .catch(err => {
    //     console.log('err', err);
    //   })

    // return x;
  }
  export default findStock;