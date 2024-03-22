const search =document.querySelector('#search')
search.addEventListener(
    "click", function(){
        document.querySelector('.timkiem').style.display="flex"
    }
)
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

const xemthem =document.querySelector('#xemthem')
xemthem.addEventListener(
    "click", function(){
        document.querySelector('.qc2').style.display="block"
        document.querySelector('#xemthem').style.display="none"
    }
)
