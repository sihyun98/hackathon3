<script>
  import { Pie } from 'vue-chartjs'

//   import axios from 'axios'
  
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
              data: [1000, 0, 0]
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
    mounted () {
        this.renderChart(this.chartData, this.options)
    }
  }
</script>