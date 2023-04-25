<template>
    <div class="container-fluid">
        <div class="row">
            <div class="offset-sm-2 col-sm-8 offset-1 col-10">

                <!-- Jumbotron -->
                <div class="row">
                    <div class="col">
                        <div class="p-4 bg-dark text-light rounded">
                            <h1>포켓몬스터 관리</h1>
                        </div>
                        
                    </div>
                </div>

                <div class="row mt-4">
                    <div class="col-sm-6 mb-4"
                    v-for="(pocketmon) in pocketmonList" :key="pocketmon.no">
                    
                        <div class="card border-dark mb-3" style="max-width: 20rem;">
                        <div class="card-header">{{pocketmon.name}}</div>
            <div class="card-body">
              <h4 class="card-title">{{pocketmon.type}}</h4>
              <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            </div>
          </div>    
                    </div>
         
                </div>

                     </div>
              
        </div>
    </div>    
    
</template>

<script>
//이 파일에서만 Axios를 사용하고 싶다면 이곳에서 import를 진행하면 된다
// - axios에 추가적인 설정을 해야하는 경우가 있다면 매 파일마다 해야함
// import axios from "axios";


export default {
    data(){
        return {
            pocketmonList:[],
        };
    },
    methods:{
        async loadList(){
            const url = "http://localhost:8080/pocketmon/";
            const resp = await this.$http.get(url); // vue에 등록한 $http를 사용
            this.pocketmonList.push(...resp.data);
        },
    },
    created(){
        this.loadList();
    },
};
</script>

<style scoped>
</style>