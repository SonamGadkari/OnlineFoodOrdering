<%@include file="/WEB-INF/views/template/header.jsp"%>

<!-- Services Section -->
<section class="page-section" id="services">
    <div class="container">
        <h2 class="text-center mt-0">View Product</h2>
        <p>Here is the detailed information about the product!</p>
        <hr class="divider my-4">
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-5">
                <img src="#" alt="image" style="width: 100%;height: 300px;" />
                </div>
            <div class="col-md-5">
                <h3>Product Name : ${product.productName}</h3>
                <p>Product description : ${product.productDescription}</p>
                <p>Manufacturer : ${product.productManufacturer}</p>
                <p>Category : ${product.productCategory}</p>
                <p>Price : <strong> ${product.productPrice} USD </strong></p>
                <a href="<c:url value="/viewCustomer"/>" class="button btn btn-success">Click to continue</a>
            </div>
        </div>
    </div>
</section>
