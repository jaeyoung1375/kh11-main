import { createApp } from 'vue'
import App from './App.vue'

// bootstrap css를 전체에서 사용 가능하도록 불러온다
// import "bootstrap/dist/css/bootstrap.min.css";
import "bootswatch/dist/cosmo/bootstrap.min.css";
import "bootstrap/js/dist/collapse.js";


// 이미 개발된 라우터 모듈을 불러오도록 구현
import { router } from './utils/router'; 


// 애플리케이션 생성 코드
const app = createApp(App);

// axios 모듈을 전체에서 사용할 수 있도록 Global 사용 설정(Vue Global Property)
import {axios} from "./utils/axios";
app.config.globalProperties.$http = axios;

// - 라우터를 사용하도록 설정해야함(use 함수 사용)
app.use(router).mount("#app");


// createApp(App).use(router).mount('#app')
