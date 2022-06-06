import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OrderDetailsService {

  constructor() { }

  // fooddetails 
  
  foodDetails = [
    {
      id:1,
      foodName:"Veggie Sandwich",
      foodDetails:"Tomato,Lettuce and Paneer ",
      foodPrice:200,
      foodImg:"https://images.unsplash.com/photo-1539252554453-80ab65ce3586?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c2FuZHdpY2h8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"
    },
    {
      id:2,
      foodName:"Macaroon Cake",
      foodDetails:"Cake with mtasty Macaroons on top",
      foodPrice:650,
      foodImg:"https://images.unsplash.com/photo-1562440499-64c9a111f713?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8Y2FrZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"
    },
    {
      id:3,
      foodName:"Veg Pizza",
      foodDetails:"Cheese",
      foodPrice:320,
      foodImg:"https://images.unsplash.com/photo-1513104890138-7c749659a591?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8cGl6emF8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"
    },
    {
      id:4,
      foodName:"Spaghetti",
      foodDetails:"A homely mix of tomato puree, seasoned with Indian spices. A filling sure to take you back to mom's kitchen.",
      foodPrice:440,
      foodImg:"https://images.unsplash.com/photo-1598866594230-a7c12756260f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8cGFzdGF8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"
    },
    {
      id:5,
      foodName:"Ice-Cream and Brownie",
      foodDetails:"Indulged in richly decadent chocolate brownie crafted with love & topped with sweet vanilla ice-cream and caramel drizzle",
      foodPrice:105,
      foodImg:"https://images.unsplash.com/photo-1551024506-0bccd828d307?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDV8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60"
    },
    {
      id:6,
      foodName:"Garden Salad",
      foodDetails:"Stuffed with farm grown cheey tomatoes and seasonal veggies",
      foodPrice:330,
      foodImg:"https://images.unsplash.com/photo-1512621776951-a57141f2eefd?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c2FsYWR8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"
    }
  ]


  

}