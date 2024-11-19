'use strict'
var category = ["Electronics", "Clothing", "Books", "Home & Garden"];
var products = [
  {
    name: "shirt",
    price: 1000,
    path: "download.jpg",
  },
  {
    name: "shirt",
    price: 1000,
    path: "download.jpg",
  },
  {
    name: "shirt",
    price: 1000,
    path: "https://www.apple.com/v/iphone/home/bx/images/overview/select/iphone_15__buwagff0mwwi_large.png",
  },
  {
    name: "shirt",
    price: 1000,
    path: "https://wrogn.com/cdn/shop/files/2_f8707c56-dcca-40f5-b220-08155f5d0952.jpg?v=1729606625&width=360",
  },
  {
    name: "shirt",
    price: 1000,
    path: "https://wrogn.com/cdn/shop/files/4_4c8d47ba-5f72-4853-b658-2df3a8894948.jpg?v=1729605541&width=360",
  },
];


//short circuit oprator
category && category.length > 0 && category.forEach(function (v, i) {
    console.log(v);
    console.log(i);
   
    var listtag = document.createElement("li");
    console.log(listtag);//empty element
     listtag.innerHTML = v;
    document.querySelector("ul").append(listtag);
});


products && products.length > 0 && products.forEach(function (v, i) {
    console.log(v, i);

    var divtag = document.createElement("div") 
    console.log(divtag);//empty element
  divtag.className = "col-xl-4 text-center";
    var imgtag = document.createElement("img");
    var h2tag = document.createElement("h2");
    var ptag = document.createElement("p");
    imgtag.src = v.path;
    imgtag.className = "img.fluid";
    h2tag.innerHTML = v.price;
    ptag.innerHTML = v.name;
    divtag.append(imgtag, h2tag, ptag);
    document.getElementById("row").append(divtag);
   
    
})