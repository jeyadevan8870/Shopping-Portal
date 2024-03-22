import React from 'react';
import image1 from "../image/Grey_Tshirt.jpg"
import Footer from './Footer';
import { useState,useEffect } from 'react';
import { useParams } from 'react-router-dom';



function Cart() {
  const [product, setProduct] = useState(null);
  const {id} = useParams();
  const [qty, setQty] = useState(1);

  useEffect(() => {
    fetch('http://localhost:8080/api/product/'+id)
    .then(res => res.json())
    .then( res => setProduct(res))
},[])

function increaseQty() {
  setQty((state) => state + 1);
}

function decreaseQty() {
  if (qty > 1) {
      setQty((state) => state - 1);
  }
}

  return (
   product && <div className='main--product'>

      <div className='aside'>
        { <h3 className='title-product'>{product.name}</h3> }
        { <p className='p-content'>{product.details}</p> }
        { <h3 className='p-rate'>{product.price}</h3> }
        <div className='qty'>
          <span className='btn-qty' onClick={increaseQty}>+</span>
          <input className='txt-qty' value={qty}/>
          <span className='btn-qty' onClick={decreaseQty}>-</span>
         </div>
         <br/>
        <div><span className='dropdown--title'>Size   : </span>
          <select className='dd-select'>
            <option value="S">S</option>
            <option value="M" selected>M</option>
            <option value="L">L</option>
            <option value="XL">XL</option>
            <option value="XXL">XXL</option>
          </select>
        </div>
        
        <div className='buttton-div'>
          <button className='button--product'>
            Add to Card
          </button>
        </div>

      </div>

      <div className='row1'>

        <img className='img1' src={product.image} alt="tshirt" />
      </div>
        
      <Footer />
    </div>

  )
}

export default Cart