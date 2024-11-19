import React from "react";
import Header from "./Header";
import Content from "./Content";
import Footer from "./Footer";
import { Outlet } from "react-router-dom";
//import App from"./
function App() {
  return (
    <>
      <Header />
      <Outlet />
      <Footer />
    </>
  );
}

export default App;
