import { createSlice } from "@reduxjs/toolkit";

const initialState = {
  value: [],
};

export const cartSlice = createSlice({
  name: "cart",
  initialState,
  reducers: {
    addInCart: (state, action) => {
      console.log("adding cart called!");
      console.log(action.payload);
      state.value.push(action.payload);
    },

    removeCart: (state, action) => {
      console.log("remove cart called!");
      console.log(action.payload);
      var res = state.value.filter((obj) => obj.id != action.payload.id);
      console.log(res);
      state.value = res;
    },
  },
});

export const { addInCart, removeCart } = cartSlice.actions;
export default cartSlice.reducer;
