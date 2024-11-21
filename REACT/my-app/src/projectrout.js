import { createBrowserRouter } from "react-router-dom";
import Home from "./components/Home";
import Login from "./components/Login";
import Register from "./components/Register";
import Content from "./components/Content";
import App from "./components/App";
import Product1 from "./components/Product1";
import Class1 from "./components/Class1";
import Class2 from "./components/Class2";
import Class3 from "./components/Class3";
import Class4 from "./components/Class4";
import CompA from "./components/CompA";
import Left from "./components/Left";
import Right from "./components/Right";
import Parent from "./components/Parent";
import Parent2 from "./components/Parent2";
import Child2 from "./components/Child2";

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
      {
        //1st rout
        path: "class1",
        element: <Class1 name="Pushpa" age="23" />,
      },
      {
        path: "class2",
        element: <Class2 />,
      },

      {
        path: "class3",
        element: <Class3 />,
      },

      {
        path: "class4",
        element: <Class4 />,
      },

      {
        path: "propsdrilling",
        element: <CompA />,
      },

      {
        path: "left",
        element: <Left />,
      },

      {
        path: "right",
        element: <Right />,
      },

      {
        path: "parent",
        element: <Parent />,
      },

      {
        path: "parent2",
        element: <Parent2 />,
      },

      {
        path: "child2",
        element: <Child2 />,
      },
    ],
  },
]);

export default projectrout;
