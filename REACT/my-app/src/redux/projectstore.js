import { configureStore } from "@reduxjs/toolkit";
//import counterReducer from "../features/counter/counterSlice";

import cartReducer from "./slices/cartSlice";
import categoryReducer from "./slices/categorySlice";

const projectstore = configureStore({
  reducer: {
    category: categoryReducer,
    cart: cartReducer,
  },
});

export default projectstore;
