// var swiper=new Swiper(".slide-content",{
//     slidesPerView:3,
//     spaceBetween:30,
//     slidesPerGroup:3,
//     loop:true,
//     loopFillGroupWithBlank:true,
//     pagination: {
//         el:".swiper-pagination",
//         clickable:true,
//     },
//     navigation: {
//         nextEl: ".swiper-button-next",
//         prevEl: ".swiper-button-prev",
//     },
// });


var tablinks = document.getElementsByClassName("tab-links");
var tabcontents = document.getElementsByClassName("tab-contents");

function opentab(tabname) {
    for (tablink of tablinks) {
        tablink.classList.remove("active-link");
    }
    for (tabcontent of tabcontents) {
        tabcontent.classList.remove("active-tab");
    }

    event.currentTarget.classList.add("active-link");
    document.getElementById(tabname).classList.add("active-tab")

}