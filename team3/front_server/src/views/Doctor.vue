<template>
  <div class="hello">

    <!-- <button type="button">보기</button> -->
    <!-- {{ name }} <br> -->
    <!-- <button type="button" @click="search">보기</button> -->
    <!-- <div v-if='view === true'> -->
      <!-- -------------------<br> -->
      {{ doctor }}
    <!-- </div> -->


  </div>
    
</template>

<script>
// import axios from "axios"

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
    // search() {
    //   axios.get('/api/member/search')
    //   .then(res => {
    //     this.doctor = res.data;
    //     console.log(this.doctor);
    //     this.view = true;
    //   })
    //   .catch(err => {
    //     console.log('err', err);
    //   })
    // }
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
