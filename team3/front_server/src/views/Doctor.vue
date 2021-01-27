<!-- API 테스트 하기 위한 임시 페이지 입니다 -->

<template>
  <div class="hello">
      {{ doctor }}
  </div>
    
</template>

<script>
// import axios from "axios"
// import findStock from '../findStock'

export default {
  name: "HelloWorld",
  props: {
    msg: String
  },
  data(){
    return{
      view: false,
      name: '',
      name2: '',
      doctor: [],
      currentVal: [],
    }
  },
  created() {

    fetch("https://sandbox-apigw.koscom.co.kr/v2/market/stocks"
    + "/kospi/lists"
    + "?apikey=l7xxc460c2c4fca442ebaef0e2d8977dc043",{
      mode: 'no-cors',
    })
    .then((response) =>
  console.log(response)
)

    // fetch('https://sandbox-apigw.koscom.co.kr/v2/market/stocks'
    // + '/kospi/lists'
    // + '?apikey=l7xxc460c2c4fca442ebaef0e2d8977dc043')
    //   .then((response) => {
    //     if(response.ok) {
    //       console.log(response.json());
    //       this.doctor = response.json();
    //     }
    //   })
    //   .catch(err => {
    //     console.log('err', err);
    //   })

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


    // axios.get('https://sandbox-apigw.koscom.co.kr/v2/market/multiquote/stocks'
    // + '/kospi/price?isuCd=' + '005930,000660'
    // + '?apikey=l7xxc460c2c4fca442ebaef0e2d8977dc043')
    //   .then(res => {
    //     this.doctor = res.data;
    //     // this.view = true;
    //   })
    //   .catch(err => {
    //     console.log('err', err);
    //   })
  },

  methods: {
    // findStock,
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
