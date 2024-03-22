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