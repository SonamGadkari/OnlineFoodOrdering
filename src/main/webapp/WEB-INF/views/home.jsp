<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="/WEB-INF/views/template/home_header.jsp"%>
<!-- Masthead -->
<header class="masthead">
    <div class="container h-100">
        <div class="row h-100 align-items-center justify-content-center text-center">
            <div class="col-lg-10 align-self-end">
                <h1 class="text-uppercase text-white font-weight-bold">Order Food you love</h1>
                <hr class="divider my-4">
            </div>
            <div class="col-lg-8 align-self-baseline">
                <p class="text-white-75 font-weight-light mb-5">This online store is a largest store for all food products.
                    We also free deliver the orders as per your choice. </p>
                <a class="btn btn-primary btn-xl js-scroll-trigger" href="#about">Find Out More!</a>
            </div>
        </div>
    </div>
</header>

<!-- About Section -->
<section class="page-section bg-primary" id="about">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-8 text-center">
                <h2 class="text-white mt-0">We've got what you need!</h2>
                <hr class="divider light my-4">
                <p class="text-white-50 mb-4">Order now! and get everything you need at a special discounts and running in no time! </p>
                <a class="btn btn-light btn-xl js-scroll-trigger" href="#services">Get Started!</a>
            </div>
        </div>
    </div>
</section>

<!-- Services Section -->
<section class="page-section" id="services">
    <div class="container">
        <h2 class="text-center mt-0">All Our Products</h2>
        <hr class="divider my-4">
    </div>
    <table class="table table-striped table-hover toable-bordered">
        <thead>
        <tr>
            <th>Photo Thumb</th>
            <th>Product Name</th>
            <th>Product Description</th>
            <th>Category</th>
            <th>Condition</th>
            <th>Price($)</th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${products}" var="product">
            <tr>
                <td><img src="#" alt="image" /></td>
                <td>${product.productName}</td>
                <td>${product.productDescription}</td>
                <td>${product.productCategory}</td>
                <td>${product.productCondition}</td>
                <td>${product.productPrice}</td>
                <td>
                    <a href="<c:url value="/viewProduct/${product.productId}"/>" >
                        <span>
                            <img src="#" alt="image" />
                        </span>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
</section>

<!-- Portfolio Section -->
<section id="portfolio">
    <div class="container-fluid p-0">
        <div class="row no-gutters">
            <div class="col-lg-4 col-sm-6">
                <a class="portfolio-box" href="<c:url value="/resources/img/portfolio/fullsize/1.jpg"/>">
                    <img class="img-fluid" src="<c:url value="/resources/img/portfolio/thumbnails/1.jpg"/>">
                    <div class="portfolio-box-caption">
                        <div class="project-category text-white-50">
                            Category
                        </div>
                        <div class="project-name">
                            Project Name
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-lg-4 col-sm-6">
                <a class="portfolio-box" href="<c:url value="/resources/img/portfolio/fullsize/2.jpg"/>">
                    <img class="img-fluid" src="<c:url value="/resources/img/portfolio/thumbnails/2.jpg"/>">
                    <div class="portfolio-box-caption">
                        <div class="project-category text-white-50">
                            Category
                        </div>
                        <div class="project-name">
                            Project Name
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-lg-4 col-sm-6">
                <a class="portfolio-box" href="<c:url value="/resources/img/portfolio/fullsize/3.jpg"/>">
                    <img class="img-fluid" src="<c:url value="/resources/img/portfolio/thumbnails/3.jpg"/>">
                    <div class="portfolio-box-caption">
                        <div class="project-category text-white-50">
                            Category
                        </div>
                        <div class="project-name">
                            Project Name
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-lg-4 col-sm-6">
                <a class="portfolio-box" href="<c:url value="/resources/img/portfolio/fullsize/4.jpg"/>">
                    <img class="img-fluid" src="<c:url value="/resources/img/portfolio/thumbnails/4.jpg"/>">
                    <div class="portfolio-box-caption">
                        <div class="project-category text-white-50">
                            Category
                        </div>
                        <div class="project-name">
                            Project Name
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-lg-4 col-sm-6">
                <a class="portfolio-box" href="<c:url value="/resources/img/portfolio/fullsize/5.jpg"/>">
                    <img class="img-fluid" src="<c:url value="/resources/img/portfolio/thumbnails/5.jpg"/>">
                    <div class="portfolio-box-caption">
                        <div class="project-category text-white-50">
                            Category
                        </div>
                        <div class="project-name">
                            Project Name
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-lg-4 col-sm-6">
                <a class="portfolio-box" href="<c:url value="/resources/img/portfolio/fullsize/6.jpg"/>">
                    <img class="img-fluid" src="<c:url value="/resources/img/portfolio/thumbnails/6.jpg"/>">
                    <div class="portfolio-box-caption p-3">
                        <div class="project-category text-white-50">
                            Category
                        </div>
                        <div class="project-name">
                            Project Name
                        </div>
                    </div>
                </a>
            </div>
        </div>
    </div>
</section>

<!-- Call to Action Section -->
<section class="page-section bg-dark text-white">
    <div class="container text-center">
        <h2 class="mb-4">Come and order !</h2>
        <a class="btn btn-light btn-xl" href="https://startbootstrap.com/themes/creative/">Order Now!</a>
    </div>
</section>

<%@include file="/WEB-INF/views/template/footer.jsp"%>
