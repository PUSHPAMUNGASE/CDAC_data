import { createSlice } from "@reduxjs/toolkit";

const initialState = {
  value: "dummy",
};

export const categorySlice = createSlice({
  name: "category",
  initialState,
  reducers: {
    datatransfer: (state, action) => {
      console.log("dataTransfer called!");
      console.log(action.payload);
      state.value = action.payload;
    },
  },
});

export const { datatransfer } = categorySlice.actions;
export default categorySlice.reducer;
