// const API_KEY = "9e6fdc4229274fd0b13e04b0c1f95ff5";
// const URL = "https://newsapi.org/v2/everything?q=";


const API_KEY = "f587be63cb774c1884498ee7a80d864d";
// const URL = "https://newsapi.org/v2/everything?q=&quot";

const URL = "https://newsapi.org/v2/everything?q=";
window.addEventListener('load', () => fetchNews('Headlines'));

async function fetchNews(query) {
    //console.log(query);
    // let res = await fetch(`${URL}${query}&from=2024-11-10&apiKey=${API_KEY}`);

         let res = await fetch(
           `${URL}${query}&from=2024-11-10&apiKey=${API_KEY}`
         );
    let data = await res.json();
    // console.log(data);
    // console.log(data.articles);
    bindNews(data.articles);
}

const bindNews = (articles) => {
    if (articles.length > 0) {
        var str = ``;
        articles.forEach(article => { 
    str += `<div class="col-xl-4 news-card">
          <div class="card">
            <img
              src="${article.urlToImage}"
              class="card-img-top"
              alt="news image"
            />
            <div class="card-body">
              <h4 class="card-title">${article.title}</h4>
              <h6>${article.source.name}📢 ${article.publishedAt}</h6>
              <p class="card-text">
                ${article.description}
              </p>
              <a href="${article.url}" class="btn btn-primary" target="_blank">Read More</a>
            </div>
          </div>
        </div>`;
            document.querySelector(".row").innerHTML = str;
        })
            
     
    }
}