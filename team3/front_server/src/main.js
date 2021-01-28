import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import vuetify from "./plugins/vuetify";
import Chartkick from 'vue-chartkick'
import Chart from 'chart.js'
import VueSession from 'vue-session'

Vue.use(Chartkick.use(Chart))
Vue.use(VueSession, sessionOptions)

Vue.config.productionTip = false;

new Vue({
  router,
  store,
  vuetify,
  render: h => h(App)
}).$mount("#app");

var sessionOptions = {
  persist: true
}