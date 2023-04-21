<template>
  
  <div>
    <!-- 헤더 -->
    <div class="header">
      <MainHeader :title="title"/>
    </div>

    <!-- 컨텐츠 -->
    <div class="contents">
      <MainContents/> 
    </div>

    <!-- 푸터 -->
    <div class="footer">
      <MainFooter/>   
    </div>
  </div>
</template>

<script>
import MainHeader from './components/MainHeader.vue';
import MainFooter from './components/MainFooter.vue';
import MainContents from './components/MainContents.vue';

export default {
  // components에서는 사용할 화면 조각(vue)를 정의한다
  components: {MainHeader,MainFooter,MainContents},
  // data에서는 현재 컴포넌트에서 사용할 데이터를 정의한다
  data(){
    return{
      title : "KH정보교육원 프론트엔드 수업자료",
    };
  }
};


</script>

<style>

</style>
