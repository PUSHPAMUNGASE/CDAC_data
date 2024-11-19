import { createBrowserRouter } from "react-router-dom";
import Home from "./components/Home";
import Login from "./components/Login";
import Register from "./components/Register";
import Content from "./components/Content";
import App from "./components/App";
import Product1 from "./components/Product1";

const projectrout = createBrowserRouter([
  {
    //1st rout
    path: "",
    element: <App />,
    children: [
      {
        path: "",
        element: <Home />,
      },
      {
        //1st rout
        path: "loginpage",
        element: <Login />,
      },
      {
        //1st rout
        path: "registerpage",
        element: <Register />,
      },
      {
        //1st rout
        path: "contentpage",
        element: <Content />,
      },
      {
        //1st rout
        path: "productpage",
        element: <Product1 />,
      },
    ],
  },
]);

export default projectrout;
