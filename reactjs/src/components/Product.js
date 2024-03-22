import React from "react";
import { Link } from 'react-router-dom';
import { Fragment } from 'react';
function Product({product}) {
  return (
    <Fragment>


        
          <div className='row'>
            <img className='img' src={product.image} alt="tshirt" />
            <div className='info'>
            <Link to={"./p1/"+product.id}>
              <h2 className='brand'>{product.name}</h2>
              </Link>
              <p className='det'>{product.price}</p>
              <p className='size'>Size: <span className='sizePro'>S M L XL XXL</span></p>

              <p className='stock'>only few left</p>

            </div>

          </div>
      
       
  
    </Fragment>
  )
}
export default Product;