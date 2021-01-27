<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Fables">
    <meta name="author" content="Enterprise Development">
    <link rel="shortcut icon" href="/resources/assets/custom/images/shortcut.png">

    <title>Gallery</title>
    
    <!-- animate.css-->  
    <link href="/resources/assets/vendor/animate.css-master/animate.min.css" rel="stylesheet">
    <!-- Load Screen -->
    <link href="/resources/assets/vendor/loadscreen/css/spinkit.css" rel="stylesheet">
    <!-- GOOGLE FONT -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
    <!-- Font Awesome 5 -->
    <link href="/resources/assets/vendor/fontawesome/css/fontawesome-all.min.css" rel="stylesheet">
    <!-- Fables Icons -->
    <link href="/resources/assets/custom/css/fables-icons.css" rel="stylesheet"> 
    <!-- Bootstrap CSS --> 
    <link href="/resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/assets/vendor/bootstrap/css/bootstrap-4-navbar.css" rel="stylesheet">
    <!-- portfolio filter gallery -->
    <link href="/resources/assets/vendor/portfolio-filter-gallery/portfolio-filter-gallery.css" rel="stylesheet">
    <!-- FANCY BOX -->
    <link href="/resources/assets/vendor/fancybox-master/jquery.fancybox.min.css" rel="stylesheet"> 
    <!-- OWL CAROUSEL  --> 
    <link href="/resources/assets/vendor/owlcarousel/owl.carousel.min.css" rel="stylesheet">
    <link href="/resources/assets/vendor/owlcarousel/owl.theme.default.min.css" rel="stylesheet">
    <!-- FABLES CUSTOM CSS FILE -->
    <link href="/resources/assets/custom/css/custom.css" rel="stylesheet">
    <!-- FABLES CUSTOM CSS RESPONSIVE FILE -->
    <link href="/resources/assets/custom/css/custom-responsive.css" rel="stylesheet">
    <style type="text/css">
        .active{
            font-weight: bold;
        }

    </style>
     
</head>

<body>

<div class="search-section">
    <a class="close-search" href="#"></a>
    <div class="d-flex justify-content-center align-items-center h-100">
        <form method="post" action="#" class="w-50">
            <div class="row">
                <div class="col-10">
                    <input type="search" value="" class="form-control palce bg-transparent border-0 search-input" placeholder="Search Here ..." /> 
                </div>
                <div class="col-2 mt-3">
                     <button type="submit" class="btn bg-transparent text-white"> <i class="fas fa-search"></i> </button>
                </div>
            </div>
        </form>
    </div>
         
</div>
    
<!-- Loading Screen -->
<div id="ju-loading-screen">
  <div class="sk-double-bounce">
    <div class="sk-child sk-double-bounce1"></div>
    <div class="sk-child sk-double-bounce2"></div>
  </div>
</div>


<!-- Start Fables Navigation -->
 <div class="fables-navigation py-3 py-lg-0" 
 style="    z-index: 100;
 position: fixed;
 width: 100%;
 background-color: #21252980;">
  <div class="container">
    <div class="row">
      <div class="col-12 col-md-10 col-lg-9 pr-md-0">
        <nav class="navbar navbar-expand-md btco-hover-menu py-lg-2">
          <a class="navbar-brand pl-0" href="index.html"
            ><img
              src="/resources/assets/custom/images/soologo2.png"
              alt="Fables Template"
              class="fables-logo"
          /></a>
          <button
            class="navbar-toggler"
            type="button"
            data-toggle="collapse"
            data-target="#fablesNavDropdown"
            aria-controls="fablesNavDropdown"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="fables-iconmenu-icon text-white font-16"></span>
          </button>
          <div class="collapse navbar-collapse" id="fablesNavDropdown">
            <ul class="navbar-nav mx-auto fables-nav">
              <li class="nav-item dropdown">
                <a
                  class="nav-link"
                  href="#"
                  id="sub-nav1"
                  aria-haspopup="true"
                  aria-expanded="false"
                >
                  Home
                </a>
              </li>

              <li class="nav-item dropdown">
                <a
                  class="nav-link"
                  href="#"
                  id="sub-nav1"
                  aria-haspopup="true"
                  aria-expanded="false"
                >
                  전기차
                </a>
                <ul class="dropdown-menu" aria-labelledby="sub-nav1">
                  <li>
                    <a class="dropdown-item" href="home1.html"
                      >전기차 소개</a
                    >
                  </li>
                  <li>
                    <a class="dropdown-item" href="home2.html">보급 목적</a>
                  </li>
                  <li>
                    <a class="dropdown-item" href="home3.html">충전 정보</a>
                  </li>
                </ul>
              </li>
              <li class="nav-item dropdown">
                <a
                  class="nav-link"
                  href="#"
                  id="sub-nav4"
                  aria-haspopup="true"
                  aria-expanded="false"
                >
                  전기차 모델
                </a>
              </li>
              <li class="nav-item dropdown">
                <a
                  class="nav-link"
                  href="#"
                  id="sub-nav5"
                  aria-haspopup="true"
                  aria-expanded="false"
                >
                  전기차 계산
                </a>
                <ul class="dropdown-menu" aria-labelledby="sub-nav5">
                  <li>
                    <a class="dropdown-item" href="blog-cat1.html"
                      >보조금지원 범위 및 해택</a
                    >
                  </li>
                  <li>
                    <a class="dropdown-item" href="blog-cat2.html"
                      >구매비용계산</a
                    >
                  </li>
                  <li>
                    <a class="dropdown-item" href="blog-cat3.html"
                      >연비계산 및 비교</a
                    >
                  </li>
                </ul>
              </li>
              <li class="nav-item dropdown">
                <a
                  class="nav-link"
                  href="#"
                  id="sub-nav6"
                  aria-haspopup="true"
                  aria-expanded="false"
                >
                  충전소
                </a>
              </li>
              <li class="nav-item dropdown">
                <a
                  class="nav-link"
                  href="#"
                  id="sub-nav7"
                  aria-haspopup="true"
                  aria-expanded="false"
                >
                  커뮤니티
                </a>
                <ul class="dropdown-menu" aria-labelledby="sub-nav7">
                  <li>
                    <a class="dropdown-item" href="contactus1.html"
                      >공지 사항</a
                    >
                  </li>
                  <li>
                    <a class="dropdown-item" href="contactus2.html"
                      >관련 뉴스</a
                    >
                  </li>
                  <li>
                    <a class="dropdown-item" href="contactus3.html"
                      >Q & A</a
                    >
                  </li>
                  <li>
                    <a class="dropdown-item" href="contactus3.html"
                      >자유 게시판</a
                    >
                  </li>
                </ul>
              </li>
            </ul>
          </div>
        </nav>
      </div>
      <div class="col-12 col-md-2 col-lg-3 pr-md-0 icons-header-mobile">
        <div class="fables-header-icons">
          <a
            href="#"
            class="open-search fables-third-text-color right top-header-link px-3 px-md-2 px-lg-4 fables-second-hover-color border-0 max-line-height"
          >
            <span class="fables-iconsearch-icon"></span>
          </a>
        </div>
      </div>
    </div>
  </div>
</div>
<!-- /End Fables Navigation -->
     
<!-- Start Header -->
<div class="fables-header fables-after-overlay bg-rules">
    <div class="container"> 
         <h2 class="fables-page-title fables-second-border-color wow fadeInLeft" data-wow-duration="1.5s">관련 기사</h2>
    </div>
</div>  
<!-- /End Header -->
     
<!-- Start Breadcrumbs -->
<div class="fables-light-background-color">
    <div class="container"> 
        <nav aria-label="breadcrumb">
          <ol class="fables-breadcrumb breadcrumb px-0 py-3">
            <li class="breadcrumb-item"><a href="#" class="fables-second-text-color">Home</a></li>
            <li class="breadcrumb-item"><a href="#" class="fables-second-text-color">공지사항</a></li>
            <li class="breadcrumb-item"><a href="#" class="fables-second-text-color">관련 기사</a></li>
            <li class="breadcrumb-item active" aria-current="page">관련 기사</li>
          </ol>
        </nav> 
    </div>
</div>
<!-- /End Breadcrumbs -->
     
<!-- Start page content -->  
       <div class="container">
        <!-- Main content -->
<section class="content">
    <div class="box box-primary">
        
        <div class="row">
            
            <div class="col-md-4 offset-md-4"><!--검색 들어갈 부분-->
                <form action="qList.do" method="post" id="search">
                    <select name="criteria" id="">
                        <option value="n" <c:out value="${empty info.search.criteria?'selected':''}" />>----</option>               
                        <option value="title" <c:out value="${info.search.criteria=='title'?'selected':''}" />>title    </option>           
                        <option value="content" <c:out value="${info.search.criteria=='content'?'selected':''}" />>content</option>             
                        <option value="name" <c:out value="${info.search.criteria=='name'?'selected':''}" />>name</option>  
                    </select>
                    <input type="text" name="keyword" value="${info.search.keyword}"/>
                    <input type="button" value="검색" class="btn btn-primary"/>           
                </form>
            </div>
        </div>
        <br>
        <table class="table">
            <tr>
                <th class='text-center' style='width:100px'>제목</th>
                <th class='text-center'>언론사</th>
                <th class='text-center'>날짜</th>
                <th class='text-center' style='width:100px'>조회수</th>
            </tr>
            <c:forEach var="vo" items="${list}">
            <tr><!-- 리스트 목록 보여주기 -->
                <td class='text-center'>${vo.bno}</td><!--번호-->
                <td><!--제목-->
                    <c:if test="${vo.re_lev!=0}">
                        <c:forEach begin="0" end="${vo.re_lev*1}">
                            &nbsp;
                        </c:forEach>
                    </c:if>
                    <a href="qHitUpdate.do?bno=${vo.bno}&page=${info.search.page}&criteria=${info.search.criteria}&keyword=${info.search.keyword}">${vo.title}</a></td>
                <td class='text-center'>${vo.name}</td><!--작성자-->
                <td class='text-center'>${vo.regdate}</td><!--날짜-->
                <td class='text-center'><span class="badge badge-pill badge-primary">${vo.readcount}</span></td>
            </tr>   
            </c:forEach>    
        </table>
        <div class="container">
            <div class="row  justify-content-md-center">
                <nav aria-label="Page navigation example">
                  <ul class="pagination"><!--하단의 페이지 나누기 부분-->
                    <c:if test="${info.prev}">
                        <li class="page-item">
                            <a href="qList.do?page=${info.search.page-1}&criteria=${info.search.criteria}&keyword=${info.search.keyword}" class="page-link">이전</a>
                        </li>                   
                    </c:if>
                    <c:forEach begin="${info.startPage}" end="${info.endPage}" var="idx">
                        <c:choose>
                            <c:when test="${idx==info.search.page}">
                                <li class="page-item active"><a class="page-link">${idx}</a></li>
                            </c:when>
                            <c:otherwise>
                                <li class="page-item"><a class="page-link" href="qList.do?page=${idx}&criteria=${info.search.criteria}&keyword=${info.search.keyword}">${idx}</a></li>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <c:if test="${info.next}">
                        <li class="page-item">
                            <a href="qList.do?page=${info.search.page+1}&criteria=${info.search.criteria}&keyword=${info.search.keyword}" class="page-link">다음</a>
                        </li>
                    </c:if>
                  </ul>
                </nav>                  
            </div>
        </div>
        <div style="height:20px"></div>
    </div>  
</section>
     </div>
<!-- /End page content -->
    
<!-- Start Footer 2 Background Image  -->
<div class="fables-footer-image fables-after-overlay white-color py-4 py-lg-5 bg-rules">
    <div class="container">
        <div class="row">
            <div class="col-12 col-lg-4 mb-4 mb-lg-0">
                <a href="#" class="fables-second-border-color border-bottom pb-3 d-block mb-3 mt-minus-13"><img src="/resources/assets/custom/images/fables-logo.png" alt="fables template"></a>
                <p class="font-15 fables-third-text-color">
                    t is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters. 
                    <br><br>
                    t is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.
                </p> 
                
            </div>
             
            <div class="col-12 col-sm-6 col-lg-4">
                <h2 class="font-20 semi-font fables-second-border-color border-bottom pb-3">Contact us</h2>
               <div class="my-3">
                    <h4 class="font-16 semi-font"><span class="fables-iconmap-icon fables-second-text-color pr-2 font-20 mt-1 d-inline-block"></span> Address Information</h4>
                    <p class="font-14 fables-fifth-text-color mt-2 ml-4">level13, 2Elizabeth St, Melbourne, Victor 2000</p>
                </div>
                <div class="my-3">
                    <h4 class="font-16 semi-font"><span class="fables-iconphone fables-second-text-color pr-2 font-20 mt-1 d-inline-block"></span> Call Now </h4>
                    <p class="font-14 fables-fifth-text-color mt-2 ml-4">+333 111 111 000</p>
                </div>
                <div class="my-3">
                    <h4 class="font-16 semi-font"><span class="fables-iconemail fables-second-text-color pr-2 font-20 mt-1 d-inline-block"></span> Mail </h4>
                    <p class="font-14 fables-fifth-text-color mt-2 ml-4">adminsupport@website.com</p>
                </div>
            </div>
            <div class="col-12 col-sm-6 col-lg-4">
                <h2 class="font-20 semi-font fables-second-border-color border-bottom pb-3 mb-3">EXPLORE OUR SITE</h2>
                <ul class="nav fables-footer-links">
                    <li><a href="about1.html">About Us</a></li>
                    <li><a href="contactus1.html">Contact Us</a></li>
                    <li><a href="gallery.html">Gallery</a></li>
                    <li><a href="team.html">Team</a></li>
                    <li><a href="blog.html">Blog</a></li>
                    <li><a href="testimonials.html">Testimonials</a></li>
                </ul>
            </div>
                      
        </div> 
        
        </div>
</div>
<div class="copyright fables-main-background-color mt-0 border-0 white-color">
        <ul class="nav fables-footer-social-links just-center fables-light-footer-links">
            <li><a href="#" target="_blank"><i class="fab fa-google-plus-square"></i></a></li>
            <li><a href="#" target="_blank"><i class="fab fa-facebook"></i></a></li>
            <li><a href="#" target="_blank"><i class="fab fa-instagram"></i></a></li>
            <li><a href="#" target="_blank"><i class="fab fa-pinterest-square"></i></a></li>
            <li><a href="#" target="_blank"><i class="fab fa-twitter-square"></i></a></li>
            <li><a href="#" target="_blank"><i class="fab fa-linkedin"></i></a></li>
        </ul>
        <p class="mb-0">Copyright © Fables 2018. All rights reserved.</p> 

</div>
    
<!-- /End Footer 2 Background Image -->




<script src="/resources/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
<script src="/resources/assets/vendor/loadscreen/js/ju-loading-screen.js"></script>
<script src="/resources/assets/vendor/jquery-circle-progress/circle-progress.min.js"></script>
<script src="/resources/assets/vendor/popper/popper.min.js"></script>
<script src="/resources/assets/vendor/timeline/jquery.timelify.js"></script>
<script src="/resources/assets/vendor/fancybox-master/jquery.fancybox.min.js"></script>
<script src="/resources/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="/resources/assets/vendor/bootstrap/js/bootstrap-4-navbar.js"></script>
<script src="/resources/assets/vendor/WOW-master/dist/wow.min.js"></script>
<script src="/resources/assets/vendor/owlcarousel/owl.carousel.min.js"></script> 
<script src="/resources/assets/custom/js/custom.js"></script>  
    
</body>
</html>