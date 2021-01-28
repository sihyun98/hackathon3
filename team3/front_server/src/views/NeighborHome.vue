<template>
  <v-app :style="{background: $vuetify.theme.themes.light.background}">
    <v-layout row>      
      <v-flex md3>
        <v-app :style="{background: $vuetify.theme.themes.light.background}">
          <v-container>

            <!-- 왼쪽 프로필 Box1-------------------------------------------->
            <v-flex>
              <v-card class="ma-5 text-center mt-8" shaped elevation="10">
                <v-avatar class="mt-n7" size="60" elevation="10">
                  <!-- 프로필(개인) 이미지 -->
                  <img src="../assets/img8.png">
                </v-avatar>

                <!-- 이름: 회원DB NAME -->            
                <v-card-title class="layout justify-center">{{ name }}</v-card-title>
                <!-- 나이, 직업: 회원DB -->
                <v-card-subtitle class="layout justify-center">{{age}}세, {{job}}</v-card-subtitle>
                <v-list class="mt-n5">
                  <v-list-item>
                    <!-- 순위, 구독자, 수익률: TEXT  -->
                    <v-list-item-title class="orange--text text--darken-3">순위</v-list-item-title>
                    <v-list-item-title class="orange--text text--darken-3">구독자</v-list-item-title>
                    <v-list-item-title class="orange--text text--darken-3">수익률</v-list-item-title>
                  </v-list-item>
                  <v-list-item class="mt-n5">
                    <!-- 순위: 계산, 구독자: 구독 DB, 수익률: 계산 -->
                    <v-list-item-subtitle>1위</v-list-item-subtitle>
                    <v-list-item-subtitle>1.2만</v-list-item-subtitle>
                    <v-list-item-subtitle>{{ totalEarning }}</v-list-item-subtitle>
                  </v-list-item>
                </v-list>
              </v-card>
            </v-flex>

            <!-- 왼쪽 프로필 Box2-------------------------------------------->
            <v-flex>
              <v-card class="ma-5 mt-n2" shaped elevation="10">
                <!-- <v-list>
                  <v-list-item>
                    <v-list-item-avatar size="10" color="orange darken-3"></v-list-item-avatar>
                    <v-list-item-title class="ml-n2">투자성향</v-list-item-title>
                    <v-list-item-subtitle>투자주식</v-list-item-subtitle>
                  </v-list-item>
                  <v-list-item>
                    <v-list-item-title class="orange--text text--darken-3">Mon</v-list-item-title>
                    <v-list-item-title class="orange--text text--darken-3">WED</v-list-item-title>
                    <v-list-item-title class="orange--text text--darken-3">FRI</v-list-item-title>
                    <v-list-item-title class="orange--text text--darken-3">SUN</v-list-item-title>
                  </v-list-item>
                  <v-list-item class="mt-n5">
                    <v-list-item-subtitle>2 times in a day before food</v-list-item-subtitle>
                  </v-list-item>
                  <v-divider></v-divider>
                </v-list> -->

                <!-- 왼쪽 프로필 Box2-1  -------------------->
                <v-list two-line="" subheader="">
                  <v-list-item>
                    <!-- 레벨에 따라서 이미지 변경 필요 : if문 -->
                    <v-list-item-avatar size="80">
                      <div v-if="grade === 'LV.1 파개미' ">
                        <img src="../assets/imglv1.png">
                      </div>
                      <div v-else-if="grade === 'LV.2 초개미' ">
                        <img src="../assets/imglv2.png">
                      </div>
                      <div v-else-if="grade === 'LV.3 노개미' ">
                        <img src="../assets/imglv3.png">
                      </div>
                      <div v-else-if="grade === 'LV.4 빨개미' ">
                        <img src="../assets/imglv4.png">
                      </div>
                      <div v-else>
                        <img src="../assets/imglv1.png">
                      </div>
                    </v-list-item-avatar>
                    <v-list-item-content class="ml-n2">

                      <!--레벨: 회원 DB -->
                      <v-list-item-title>{{grade}}</v-list-item-title>
                      <!-- <v-list-item-subtitle>California Hospital Medical</v-list-item-subtitle> -->
                    </v-list-item-content>
                  </v-list-item>
                  <v-divider></v-divider>
                </v-list>

                <!-- <v-list two-line="" subheader="" class="mt-n5">
                  <v-list-item>
                    <v-list-item-title>투자성향</v-list-item-title>
                    <v-list-item-subtitle>단타위주</v-list-item-subtitle>
                  </v-list-item>               
                </v-list> -->

                <!-- 왼쪽 프로필 Box2-2  -------------------->
                <!--투자성향, 연봉, 재산: 회원 DB -->
                <v-list two-line="" subheader="">
                  <v-list-item>
                      <v-list-item-avatar size="10" color="orange darken-3"></v-list-item-avatar>
                      <v-list-item-title class="ml-n2">투자성향</v-list-item-title>
                      <v-list-item-subtitle>{{investOpt}}</v-list-item-subtitle>
                  </v-list-item>

                  <v-list-item>
                      <v-list-item-avatar size="10" color="orange darken-3"></v-list-item-avatar>
                      <v-list-item-title class="ml-n2">연봉</v-list-item-title>
                      <v-list-item-subtitle>{{salary}}만원</v-list-item-subtitle>
                  </v-list-item>

                  <v-list-item>
                      <v-list-item-avatar size="10" color="orange darken-3"></v-list-item-avatar>
                      <v-list-item-title class="ml-n2">재산</v-list-item-title>
                      <v-list-item-subtitle>{{property}}만원</v-list-item-subtitle>
                  </v-list-item>
                
                <!-- <v-list two-line="" subheader="" class="mt-n5">
                  <v-list-item>
                    <v-list-item-title>Surgeon</v-list-item-title>
                    <v-list-item-subtitle>spinal pain</v-list-item-subtitle>
                  </v-list-item>               
                </v-list>

                <v-list two-line="" subheader="" class="mt-n5">
                  <v-list-item>
                    <v-list-item-title>Surgeon</v-list-item-title>
                    <v-list-item-subtitle>spinal pain</v-list-item-subtitle>
                  </v-list-item>               
                </v-list> -->
                  <v-divider></v-divider>
                </v-list>

                <!-- v-list -------------------->
                <!-- 소개글: 회원 DB -->
                <v-list two-line="" subheader="" > <!--class="my-n8">  -->                
                  <v-list-item>
                    <v-list-item-title class="orange--text text--darken-3">소개글</v-list-item-title>
                    <!-- <v-list-item-title class="orange--text text--darken-3">Time</v-list-item-title> -->
                  </v-list-item>
                  <v-list-item class="mt-n10" >
                    <v-list-item-title >{{profile}}</v-list-item-title>
                    <!-- <v-list-item-title >12:45</v-list-item-title> -->
                  </v-list-item>
                  <v-divider></v-divider>
                </v-list>

              </v-card>
            </v-flex>

            <!-- 왼쪽 프로필 Box3-------------------------------------------->
            <v-flex v-if="checkSubscribe === false"> 
              <v-card class="ma-5 text text-center mt-6" shaped elevation="10">
                <v-list-item three-line @click="goSubscribe">
                  <v-list-item-content>
                    <v-list-item-title class="headline mb-1"> 구독하기
                      <!-- <v-icon>구독하기</v-icon>                         -->
                     </v-list-item-title>
                    <!-- <v-list-item-subtitle>2345 4546 7889 5432</v-list-item-subtitle>  -->
                  </v-list-item-content>
                  <v-list-item-avatar size="60" color="orange darken-3">
                    <v-icon color="white">fas fa-suitcase-rolling</v-icon>
                  </v-list-item-avatar>
                </v-list-item>
              </v-card>
            </v-flex>
            <v-flex v-else> 
              <v-card class="ma-5 text text-center mt-6" shaped elevation="10">
                <v-list-item three-line>
                  <v-list-item-content>
                    <v-list-item-title class="headline mb-1"> 구독중
                      <!-- <v-icon>구독하기</v-icon>                         -->
                     </v-list-item-title>
                    <!-- <v-list-item-subtitle>2345 4546 7889 5432</v-list-item-subtitle>  -->
                  </v-list-item-content>
                  <v-list-item-avatar size="60" color="orange darken-3">
                    <v-icon color="white">fas fa-suitcase-rolling</v-icon>
                  </v-list-item-avatar>
                </v-list-item>
              </v-card>
            </v-flex>
            
          </v-container>
        </v-app>
      </v-flex>

  <!-- 오른쪽 화면-------------------------------------------->
  <v-flex md9>
    <v-app :style="{background: $vuetify.theme.themes.dark.background}" class="rounded">
      <v-container>
        <v-flex>
          <v-list class="mt-5">
            <v-list-item>
              <v-list-item-title class="orange--text text--darken-3">Summary</v-list-item-title>
                <v-list-item-action>
                  <!-- SEE-ALL 버튼 숨김 -->
                  <!-- <v-btn class="ma-2" tile outlined="" color="orange darken-3"> -->
                    <!-- <v-icon left>fas fa-eye</v-icon> See ALL -->
                  <!-- </v-btn> -->
                </v-list-item-action>
            </v-list-item>
          </v-list>
        </v-flex>

  
  <v-flex>    
    <v-row no-gutter>   
      <!-- 오른쪽 상단 BOX1 --------------------------------------->   
      <v-col cols="12" md="4">
        <v-row>
          <v-col cols="12" md="2">
            <v-card height="80px" width="10px" color="orange darken-1"></v-card>
          </v-col>
          <v-col cols="12" md="10">            
            <v-list two-line="" subheader="" class="ml-n8" >
              <v-list-item>
                <v-list-item-avatar size="60" >
                    <v-icon color="orange darken-3">fas fa-wallet</v-icon>  
                </v-list-item-avatar>
                <v-list-item-content>                    
                    <v-list-item-subtitle>총 자산</v-list-item-subtitle>
                    <v-list-item-title>{{ totalProperty }}원</v-list-item-title>                    
                </v-list-item-content>
                
              </v-list-item>
            </v-list>
          </v-col>
        </v-row>
      </v-col>

      <!-- 오른쪽 상단 BOX2 --------------------------------------->
      <v-col cols="12" md="4">
        <v-row>
          <v-col cols="12" md="2">
            <v-card height="80px" width="10px" color="orange darken-1"></v-card>
          </v-col>
          <v-col cols="12" md="10">
            <v-list two-line subheader class="ml-n8">
              <v-list-item>
                <!-- 데이터에 따라 up down if문 작성 -->
                <v-list-item-avatar size="60" >
                    <div v-if="totalProfit >= 0 ">
                      <v-icon color="red accent-4" size="30">fas fa-sort-up</v-icon>
                    </div>
                    <div v-else>
                      <v-icon color="light-blue darken-2" size="30">fas fa-sort-down</v-icon>
                    </div>
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-subtitle>손익</v-list-item-subtitle>
                  <v-list-item-title>{{ totalProfit }}원</v-list-item-title>
                  <!-- <v-list-item-subtitle>Incurable</v-list-item-subtitle> -->
                </v-list-item-content>
              </v-list-item>
            </v-list>
          </v-col>
        </v-row>
      </v-col>

      <!-- 오른쪽 상단 BOX3 --------------------------------------->
      <v-col cols="12" md="4">
        <v-row>
          <v-col cols="12" md="2">
            <v-card height="80px" width="10px" color="orange darken-1"></v-card>
          </v-col>
          <v-col cols="12" md="10">
            <v-list two-line subheader class="ml-n8">
              <v-list-item>
                <!-- 데이터에 따라 up down if문 작성 -->
                <v-list-item-avatar size="60" >
                    <div v-if="totalEarningRate >= 0 ">
                      <v-icon color="red accent-4" size="30">fas fa-sort-up</v-icon>
                    </div>
                    <div v-else>
                      <v-icon color="light-blue darken-2" size="30">fas fa-sort-down</v-icon>
                    </div>
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-subtitle>수익률</v-list-item-subtitle>
                  <v-list-item-title>{{ totalEarningRate }}%</v-list-item-title>
                  <!-- <v-list-item-subtitle>Examiniations</v-list-item-subtitle> -->
                </v-list-item-content>
              </v-list-item>
            </v-list>
          </v-col>
        </v-row>
      </v-col>

    </v-row>
  </v-flex>


  <v-flex class="mt-12">
    <v-row no-gutters="">
      <v-col cols="12" md="4">

        <!-- 상단 제목 + 버튼 -------------------------->
        <v-flex>
          <v-list class="mt-5">
            <v-list-item>
              <v-list-item-title class="orange--text text--darken-3">포트폴리오 비율</v-list-item-title>
              <!-- <v-item-content>
                <v-btn class="mr-1" outlined color="orange darken-3">D</v-btn>
              </v-item-content>
              <v-item-content>
                <v-btn class="mr-1" outlined color="orange darken-3">W</v-btn>
              </v-item-content>
              <v-item-content>
                <v-btn class="mr-1" outlined color="orange darken-3">M</v-btn>
              </v-item-content>
              <v-item-content>
                <v-btn outlined color="orange darken-3">Y</v-btn>
              </v-item-content> -->
            </v-list-item>
          </v-list>
        </v-flex>        
        

       <!-- 중간 그래프(파이그래프) -------------------------->
        <v-flex class="ml-5">
          <!-- <v-row> -->
            <v-card>
              <v-card-text>
                <pie-chart></pie-chart>
                </v-card-text>
            </v-card>
          <!-- </v-row> -->
        </v-flex>

        <!-- 아래 항목명 -------------------------->
        <!-- <v-flex class="mt-5">
          <v-list class="ml-5">
            <v-list-item>
              <v-list-item-avatar color="orange darken-4" size="20px"></v-list-item-avatar>
              <v-list-item-title>주식</v-list-item-title>
              <v-list-item-avatar color="grey lighten-1" size="20px"></v-list-item-avatar>
              <v-list-item-title class="ml-5">채권</v-list-item-title>
            </v-list-item>
          </v-list>
        </v-flex> -->

      </v-col>

      <v-col cols="12" md="8">
        <!-- 오른쪽 -------------------------->
        <v-flex class="ml-10">
          <v-list class="mt-5">
            <v-list-item>
              <v-list-item-title class="orange--text text--darken-3">투자 종목 리스트</v-list-item-title>
              <!-- <v-btn color="orange darken-3" class="mr-3" @click="excelDownFunc()"> 내려받기 </v-btn> -->
              <v-btn class="ma-2" tile outlined="" color="orange darken-3" @click="excelDownFunc()"> 
                <v-icon left>far fa-file-excel</v-icon> Download
              </v-btn>
            </v-list-item>
          </v-list>
        </v-flex>

        <v-flex class="ml-10"> 
            <v-card>
              <v-card-title>
                <v-text-field
                  v-model="search"
                  append-icon="mdi-magnify"
                  label="Search"
                  single-line
                  hide-details
                ></v-text-field>
              </v-card-title>
              <v-data-table
                :headers="headers"
                :items="Stock"
                :search="search"
              ></v-data-table>
            </v-card>
        </v-flex>     
        
      </v-col>
      
    </v-row>
  </v-flex>
<!-- 
  <v-flex class="mt-12">
    <v-row no-gutters="">
      <v-col cols="12" md="4"> -->



      </v-container>

    </v-app>
  </v-flex>
    </v-layout>
  </v-app>
</template>


<script>
// import store from "../store/index"

// import userId from "../store/variable";
const gradients = [
  ['#222'],
    ['#42b3f4'],
    ['red', 'orange', 'yellow'],
    ['purple', 'violet'],
    ['#00c6ff', '#F0F', '#FF0'],
    ['#f72047', '#ffd200', '#1feaea'],
]
export default {
  // props: ["num"],
  data: () => ({
    with: 2,
    radius: 10,
    padding: 8,
    lineCap: 'round',
    gradient: gradients[5],
    value: [0, 2, 5, 9, 5, 10, 3, 5, 0, 0, 1, 8, 2, 9, 0],
    gradientDirection: 'top',
    gradients,
    fill: false,
    type: 'trend',
    autoLineWidth: false,
    arrayEvents: null,
    date2: new Date().toISOString().substr(0,10),   
  }),
  
  
  computed: {
    theme(){
      return this.$vuetify.theme.dark ? "dark" :"light";
    },
  },
  mounted (){
    this.arrayEvents = [...Array(6)].map(() => {
      const day = Math.floor(Math.random() * 30)
      const d = new Date()
      d.setDate(day)
      return d.toISOString().substr(0,10)
    })
  },

  methods: {
    functionEvents (date) {
      const [,, day] = date.split('-')
      if ([12, 17, 28].includes(parseInt(day, 10))) return true
      if ([1, 19, 22].includes(parseInt(day,10))) return ['red', '#00f']
      return false
    },
  }
}
</script>

<script>
import axios from 'axios'
import priceComma from '../priceComma'
import findStock from '../findStock'
import PieChart from '../components/PieChart2'
import XLSX from 'xlsx'

export default {
  data: () => ({
//테이블
    search: '',
    headers: [
      {
        text: '타입',
        align: 'start',
        sortable: false,
        value: 'assertType',
      },
      { text: '종목', value: 'stockNm' },
      { text: '평가금액', value: 'valEvalu' },
      { text: '수익률', value: 'earningRate' },
      { text: '손익', value: 'profit' },
      { text: '잔고', value: 'qty' },      
      { text: '매입가', value: 'valTrade' },    
      { text: '현재가', value: 'valCur' },
    ],
    Stock: [],
    name: '',
    username: '',
    password: '',
    grade: '',
    age: '',
    job: '',
    investOpt: '',
    salary: '',
    property: '',
    profile: '',   
    totalProperty: 0,
    totalProfit: 0,
    totalEarningRate: 0,
    total: 0,
    checkSubscribe: false,
    my_id: 0,
    subscriber_id: 0,

  }),
  computed: {
    form(){
      return{
        my_id: this.my_id,
        subscriber_id: this.subscriber_id,
      }
    }
  },
  async created(){
    // this.$session.set('neighbor_id', this.$route.params.id)
    // console.log("neighbor id : " + this.$session.get(neighbor_id))
    // console.log("neighbor id: "+ this.$route.params.id);
    this.form.my_id = this.$session.get('user_no');
    this.form.subscriber_id = this.$route.params.id;

    axios.get('/api/member/search/' + this.$route.params.id)
      .then(res => {
        console.log(res.data);
        this.name = res.data.name,
        this.username = res.data.username,
        this.grade = res.data.grade,
        this.age = res.data.age,
        this.job = res.data.job,
        this.investOpt = res.data.investOpt,
        this.salary = priceComma(res.data.salary),
        this.property = priceComma(res.data.property),
        this.profile = res.data.profile,
        this.totalEarning = res.data.totalEarning
        console.log(this.name);
      })
      .catch(err => {
        console.log('err', err);
      })

    await axios.post('/api/subscribe/check', this.form)
    .then(res => {
      if(res.data.code == "OK"){
        this.checkSubscribe = true;
      }
    })

    await axios.get('/api/stock/search/' + this.$route.params.id)
      .then(res => {
        const msg = res.data;
        this.Stock = msg;
        console.log(+ this.$route.params.id + " : " + this.Stock);
        for(var i=0; i<this.Stock.length; i++){
          this.totalProperty += this.Stock[i].valEvalu;
          this.totalProfit += this.Stock[i].profit;
          this.total += this.Stock[i].valTrade * this.Stock[i].qty;
          this.Stock[i].valTrade = priceComma(this.Stock[i].valTrade);
          this.Stock[i].valCur = priceComma(this.Stock[i].valCur);
          this.Stock[i].valEvalu = priceComma(this.Stock[i].valEvalu);
          this.Stock[i].profit = priceComma(this.Stock[i].profit);
          // console.log(findStock('000020'));
        }
        this.totalEarningRate = (this.totalProfit / this.total) * 100;
        this.totalEarningRate = this.totalEarningRate.toFixed(2);
        this.totalProperty = priceComma(this.totalProperty);
        this.totalProfit = priceComma(this.totalProfit);
      })
      .catch(err => {
        console.log('err', err);
      })

      console.log("2 : " + this.Stock);
  },
  methods: {
    priceComma,
    findStock,
    excelDownFunc(){
      var dataWS = XLSX.utils.json_to_sheet(this.Stock);
      var wb = XLSX.utils.book_new();
      XLSX.utils.book_append_sheet(wb, dataWS, 'nameData');
      XLSX.writeFile(wb, '옆집개미 투자 종목 리스트.xlsx');
    },
    async goSubscribe() {
      await axios.post('/api/subscribe', this.form)
        .then(res => {
          if(res.data.code == "OK"){
            this.checkSubscribe = true;
          }
        })
      // this.checkSubscribe = true;
    }
  },
  components: {
    PieChart
  }
}
</script>




<style scoped>
.rounded {
  border-top-left-radius: 50px;
  border-bottom-left-radius: 50px;
}
</style>

