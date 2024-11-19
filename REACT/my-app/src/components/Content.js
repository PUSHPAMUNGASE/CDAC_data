import React from "react";
import Product from "./Product";
function Content() {
  return (
    <div className="container">
      <div className="row">
        <div className="col-xl-3">
          <Product name="Nike" price="1399" />
        </div>
        <div className="col-xl-3">
          <Product name="Bata" price="1699" />
        </div>
        <div className="col-xl-3">
          <Product name="Adidas" price="4399" />
        </div>
        <div className="col-xl-3">
          <Product name="Spark" price="1999" />
        </div>
      </div>
    </div>
  );
}
export default Content;
