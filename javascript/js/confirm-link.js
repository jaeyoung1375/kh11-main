/*
    확인 메시지 출력 후 이동하는 링크 구현
*/
window.addEventListener("load",function(){
    var confirmLinkList = document.querySelectorAll(".confirm-link");
    for(var i = 0; i<confirmLinkList.length; i++){
        confirmLinkList[i].addEventListener("click",function(e){
            // 안내메시지 설정
            var text = this.dataset.message || "정말 이동하시겠습니까?";


            var choice = window.confirm(text);
            if(!choice){
                e.preventDefault();
            }
        });
    }
});