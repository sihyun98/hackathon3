<script>
  import { Pie } from 'vue-chartjs'

  import axios from 'axios'
  
  export default {
    extends: Pie,
    data () {
      return {
        chartData: {
          labels: ["주식", "펀드", "암호화폐"],
          datasets: [{
              borderWidth: 1,
              borderColor: ['#EF6C00','#FFB74D','#FFCC80'],
              backgroundColor: ['#EF6C00','#FFB74D','#FFCC80'],
              data: [1000, 1000, 1000]
            }]
        },
        options: {
          legend: {
            display: true
          },
          responsive: true,
          maintainAspectRatio: false
        }, 
        Stock: [],
        Prices: [0, 0, 0],
        totalPrice: 0,
      }
    },
    async mounted () {

      await axios.get('/api/stock/search/' +  this.$session.get('user_no'))
        .then(res => {
          const msg = res.data;
          this.Stock = msg;
          for(var i=0; i<this.Stock.length; i++){
            if(this.Stock[i].assertType == "주식"){
              this.Prices[0] += this.Stock[i].valEvalu;
            }
            else if(this.Stock[i].assertType == "펀드"){
              this.Prices[1] += this.Stock[i].valEvalu;
            }
            else{
              this.Prices[2] += this.Stock[i].valEvalu;
            }
          }
          console.log(this.chartData.datasets[0].data)
          console.log(this.Prices)
          this.totalPrice = this.Prices[0] + this.Prices[1] + this.Prices[2]
          this.Prices[0] = (this.Prices[0] / this.totalPrice) * 3000
          this.Prices[1] = (this.Prices[1] / this.totalPrice) * 3000
          this.Prices[2] = (this.Prices[2] / this.totalPrice) * 3000
          this.chartData.datasets[0].data = this.Prices
        })
        .catch(err => {
          console.log('err', err);
        })



      this.renderChart(this.chartData, this.options)
    }
  }
</script>