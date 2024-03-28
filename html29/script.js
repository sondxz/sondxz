/*Sản phẩm liên quan*/
const next =document.querySelector('.fa-chevron-right')
let index=0
next.addEventListener(
    "click", function(){
        if(index<=0){
            index=index+1
            document.querySelector('.slider-content-left').style.right = index*98+"%"
            document.querySelector('.fa-chevron-right').style.display = "none"
            document.querySelector('.fa-chevron-left').style.display = "block"
        }
        
    }
);
const prev =document.querySelector('.fa-chevron-left')
prev.addEventListener(
    "click", function(){
        if(index>0){
            index=index-1
            document.querySelector('.slider-content-left').style.right = index*100+"%"
            document.querySelector('.fa-chevron-right').style.display = "block"
            document.querySelector('.fa-chevron-left').style.display = "none"
        }
        
    }
);

/*Tìm kiếm*/
const search =document.querySelector('#search')
search.addEventListener(
    "click", function(){
        document.querySelector('.timkiem').style.display="flex"
    }
)
/*Đăng nhập */
const login =document.querySelector('.fa-user')
login.addEventListener(
    "click", function(){
        document.querySelector('.bgcolor').style.display="block"
    }
)

const close =document.querySelector('.close')
close.addEventListener(
    "click", function(){
        document.querySelector('.bgcolor').style.display="none"
    }
)
/*Xem thêm */
const xemthem =document.querySelector('#xemthem')
xemthem.addEventListener(
    "click", function(){
        document.querySelector('.qc2').style.display="block"
        document.querySelector('#xemthem').style.display="none"
    }
)

