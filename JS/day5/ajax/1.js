'use strict';


//DOM event listner
document.getElementById('btn1').addEventListener('click',function () {
    //alert("button 1 clicked")
    var xmlhttp = new XMLHttpRequest();
    console.log(xmlhttp);
    console.log(xmlhttp.readyState);
    //if 0: request is not initialize
    console.log(xmlhttp.status);
    xmlhttp.onreadystatechange = function () {
        console.log(xmlhttp.readyState);
        console.log(xmlhttp.status);
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            console.log(xmlhttp.responseText);
            var res = JSON.parse(xmlhttp.responseText);
            console.log(res);
            res && res.length > 0 && res.forEach(function (v, i) {
                console.log(v, i);
                
                var divtag = document.createElement("div");
                var imgtag = document.createElement("img");
                var h2tag = document.createElement("h2");
                var ptag = document.createElement("p");
                imgtag.src = v.image;
                h2tag.innerHTML = v.title;
                divtag.className = 'col-xl-3 text-center';
                imgtag.className = "img-fluid";
                ptag.innerHTML = v.price;

                divtag.append(imgtag, h2tag, ptag);
                document.querySelector('#row').append(divtag);
            });
        }

    }
    xmlhttp.open("GET", "https://fakestoreapi.com/products");//fetch,send,update,delete then open method;
    xmlhttp.send();
    //
})