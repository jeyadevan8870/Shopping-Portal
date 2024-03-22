import React, { useEffect } from 'react';
import './Home.css';
import Product from '../components/Product';
import image2 from "../image/LOGO.jpg"
import Ads from "../image/ads.jpg"
import { Link } from 'react-router-dom';
import { useState,Fragment} from 'react';


function Home() {
  const [products, setProducts] = useState([]);
  useEffect(() => {
    fetch('http://localhost:8080/api/product')
    .then(res => res.json())
    .then( res => setProducts(res))
})

  return (<Fragment>
    <div>
      <div className='home--img' style={{ backgroundImage: `url(${image2})`,backgroundRepeat:'no-repeat' }}>
      <h1 className='background--h1'>Hello! </h1>
      <p className='backgrond--p'>Best  quality Products in here!</p>
     
      <img className='ads--back' src={Ads}/>
      </div>
      <h3>
        <Link to="/Mens">
          best of product
        </Link>
        
      </h3>
      <div className='pdiv'>
        {products.map(product =><Product product={product} />) }
        
        </div>
 
    </div>
   

    </Fragment>
  )
}

export default Home