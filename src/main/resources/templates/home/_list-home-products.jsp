<th:block th:fragment="banner" xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/extras/spring-security">


<th:block>


	
		<div class="row">
       

            <div class="col-md-12">
                <div class="tab-content products-style-4">
                    <div class="tab-pane fade show active" id="arrivals" role="tabpanel" aria-labelledby="arrivals-tab">
                    	<div class="row">
                        	
                        	
                        	<th:block th:each="item : ${products}">
                        	<div class="col-md-3 col-6 mb-4 pb-2">
                                <div class="product-box common-cart-box text-center">
                                    <div class="product-img common-cart-img">
                                    
                                        <img th:src="${item.imgUrl}" alt="product-img">
<!--                                         <div class="hover-option"> -->
<!--                                             <ul class="hover-icon"> -->
<!--                                                 <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li> -->
<!--                                                 <li><a href="#"><i class="fa fa-heart"></i></a></li> -->
<!--                                                 <li><a href="#test-popup3" class="quickview-popup-link"><i class="fa fa-eye"></i></a></li> -->
<!--                                                 <li><a href="#"><i class="fa fa-refresh"></i></a></li> -->
<!--                                             </ul> -->
<!--                                             <ul class="product-color"> -->
<!--                                                 <li><a href="#" class="blue-dot"></a></li> -->
<!--                                                 <li><a href="#" class="black-dot"></a></li> -->
<!--                                                 <li><a href="#" class="pink-dot"></a></li> -->
<!--                                             </ul> -->
<!--                                         </div> -->
                                    </div>
                                    
                                    
                                    
                                    <div class="product-info common-cart-info">
                                        <a href="product-detail.html" class="cart-name" th:utext="${item.productName }"></a>
                                        <div class="product-rate"> 
                                            <i class="ion-android-star"></i> 
                                            <i class="ion-android-star"></i> 
                                            <i class="ion-android-star"></i> 
                                            <i class="ion-android-star"></i> 
                                            <i class="ion-android-star-half"></i> 
                                        </div>
                                        <p class="cart-price"><del th:utext="${item.oldPrice}"></del ><span th:utext="${item.newPrice}"></span></p>
                                    </div>
                                </div>
                        	</div>
                          
                        	
                        	</th:block>
                        	
                          
                          
                         
                      
                        </div>
                    </div>
                   
                   
                  
               
                </div>
            </div>
      
      
      
        </div>
   
   
   





<!-- End Popular Products Section -->

</th:block>

	
	
	</th:block>
