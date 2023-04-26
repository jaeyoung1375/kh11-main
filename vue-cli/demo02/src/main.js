import { createApp } from 'vue'
import App from './App.vue'

//bootstrap css를 전체에서 사용 가능하도록 불러온다
//import "bootstrap/dist/css/bootstrap.min.css";
//bootswatch css 불러오기
import "bootswatch/dist/cosmo/bootstrap.min.css";

import "bootstrap/dist/js/bootstrap.bundle.min.js";


//이미 개발된 라우터 모듈을 불러오도록 구현(index.js는 경로에서 생략 가능)
import {router} from './utils/router'
//import {router} from './utils/router/index.js'


//애플리케이션 생성 코드
const app = createApp(App);

//axios 모듈을 전체에서 사용할 수 있도록 Global 사용 설정(Vue Global Property)
import { axios } from "./utils/axios";
//app.config.globalProperties["$http"] = axios;
app.config.globalProperties.$http = axios;

//라우터를 사용하도록 설정해야함(use 함수 사용)
app.use(router);

//vuex를 사용하도록 설정해야함
import { storage } from './utils/vuex';
app.use(storage);

//생성된 app을 id=app 영역을 제어할 수 있도록 설정
app.mount("#app");
