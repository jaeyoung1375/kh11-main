// 라우터 모듈 만들기
// - 이곳에 필요한 라우터 객체와 설정을 다 작성
// - 외부에 필요한 요소만 공개(export)
// - default export를 할 것인지
// - named export를 할 것인지

import { createRouter, createWebHashHistory } from "vue-router";
import MainContent from "@/components/MainContents.vue";
import DevInfo from "@/components/DevInfo.vue";
import pocketmonManage from "@/components/PocketmonManage.vue";
import subjectManage from "@/components/SubjectManage.vue";
import NotFound from "@/components/error/NotFound.vue";

// 라우터 생성
const router = createRouter({
    // 이력(주소) 관리 방식
    history:createWebHashHistory(),
    // history:createWebHistory(),
    // 실제 라우터가 연결해줄 주소와 컴포넌트 명단
    routes:[
        // 주소(/)로 들어올 경우 컴포넌트(mainContent.vue)를 표시한다
        {path : "/",component:MainContent},
        // 주소(/info)로 들어올 경우 컴포넌트 DevInfo.vue를 표시한다
        {path: "/info",component:DevInfo},

        {path: "/pocketmon",component:pocketmonManage},
        {path: "/subject",component:subjectManage},

        // 위에 해당하지 않는 모든 페이지는 NotFound.vue로 연결한다
        // - wildCard(*)가 작동하지 않는다
        // - 패턴을 알려주기 위한 별도의 식을 작성해야 한다.
        {path: "/:pathMatch(.*)",component:NotFound},
    ],
});

// 외부에 공개 설정
export {router};
// export default router;
