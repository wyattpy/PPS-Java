<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 8/12/2020
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
%>
<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">

    <!--====== Title ======-->
    <title>PPS</title>

    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!--====== Favicon Icon ======-->
    <link rel="shortcut icon" href="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" type="image/png">

    <!--====== Magnific Popup CSS ======-->
    <link rel="stylesheet" href="https://drive.google.com/uc?export=view&id=1Tv2HAg_MZ1ZFDpbMJ5q9xquA-zU7yOGC">

    <!--====== Slick CSS ======-->
    <link rel="stylesheet" href="https://drive.google.com/uc?export=view&id=1sesrX5-SymWXy1nX0ABkvISENSxMggGU">

    <!--====== Line Icons CSS ======-->
    <link rel="stylesheet" href="https://drive.google.com/uc?export=view&id=1W-bCfaqcnFgjyElEZnAVgIZ6-yEKJkiV">

    <!--====== Bootstrap CSS ======-->
    <link rel="stylesheet" href="https://drive.google.com/uc?export=view&id=1nqD5QBx1sF9x5FzvRE_f4L9gJZuAX1MF">

    <!--====== Default CSS ======-->
    <link rel="stylesheet" href="https://drive.google.com/uc?export=view&id=1_6iUeqk2bNF9SLUeyx-wEYdGVKc44lUD">

    <!--====== Style CSS ======-->
    <link rel="stylesheet" href="https://drive.google.com/uc?export=view&id=1JaZipGlTXs9Yc511wcJScbK2ucGF19dZ">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css">

</head>

<body>
<!--[if IE]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
<![endif]-->


<!--====== PRINICNG START ======-->

<section id="pricing" class="pricing-area ">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-6 col-md-10">
                <div class="section-title text-center pb-25">
                    <h3 class="title">Planes exclusivos para ti</h3>
                    <p class="text">Deje de pereder tiempo y dinero buscando un estacionamiento adecuado, con nosotros solo perderá dinero!!!.</p>
                </div> <!-- section title -->
            </div>
        </div> <!-- row -->
        <div class="row justify-content-center">

            <div class="col-lg-4 col-md-7 col-sm-9">
                <div class="pricing-style mt-30">
                    <div class="pricing-icon text-center">
                        <img src="https://drive.google.com/uc?export=view&id=124cL8OZGkI2qJSkSDhVo8VjXo3R6XhXx" alt="" width="200" height="200">
                    </div>
                    <div class="pricing-header text-center">
                        <h5 class="sub-title">Premium</h5>
                        <p class="month"><span class="price">₲ 400.000</span>/mes</p>
                    </div>
                    <div class="pricing-list text-center">
                        <ul>
                            <li><i class="lni lni-check-mark-circle"></i> El plan que usted necesita</li>
                            <li><i class="lni lni-check-mark-circle"></i> Acceso 24/7 a las instalaciones</li>
                            <form action="nuevocontrato.jsp?plan=1" method="get">
                                <label>
                                    <input type="button" value="Contratar este Plan">
                                </label>
                            </form>
                        </ul>
                    </div>
                </div> <!-- pricing style one -->
            </div>

            <div class="col-lg-4 col-md-7 col-sm-9">
                <div class="pricing-style mt-30">
                    <div class="pricing-icon text-center">
                        <img src="https://drive.google.com/uc?export=view&id=1UEc45AVavWW1tlsEh9kAhKeGIBGwAMnF" alt="" width="200" height="200">
                    </div>
                    <div class="pricing-header text-center">
                        <h5 class="sub-title">Ejecutivo</h5>
                        <p class="month"><span class="price">₲ 15.000.000</span>/año</p>
                    </div>
                    <div class="pricing-list text-center">
                        <ul>
                            <li><i class="lni lni-check-mark-circle"></i> Para su empresa</li>
                            <li><i class="lni lni-check-mark-circle"></i> Incluye el piso de 50 lugares</li>
                            <form action="nuevocontrato.jsp?plan=2" method="get">
                                <label>
                                    <input type="button" value="Contratar este Plan">
                                </label>
                            </form>
                        </ul>
                    </div>
                </div> <!-- pricing style one -->
            </div>
        </div> <!-- row -->
    </div> <!-- container -->
</section>


<!--====== Jquery js ======-->
<script src="https://drive.google.com/uc?export=view&id=1ZCBLzG48q2Of-zSbBZbgg6bu0yCEJJlr"></script>
<script src="https://drive.google.com/uc?export=view&id=1j_jV-7eCqPgpIfTCuxfhdTaKOnt1EQZJ"></script>

<!--====== Bootstrap js ======-->
<script src="https://drive.google.com/uc?export=view&id=1_tMuX-1kOxQv5nzeDlUk2GMXQXwdjsgb"></script>
<script src="https://drive.google.com/uc?export=view&id=1zCCbiZiyZcBebWpy10nBROVB17hbPH2c"></script>

<!--====== Slick js ======-->
<script src="https://drive.google.com/uc?export=view&id=1utL2az75fCM1GOWiB3F6PH6Fj2V0VMK-"></script>

<!--====== Magnific Popup js ======-->
<script src="https://drive.google.com/uc?export=view&id=1Tv2HAg_MZ1ZFDpbMJ5q9xquA-zU7yOGC"></script>

<!--====== Ajax Contact js ======-->
<script src="https://drive.google.com/uc?export=view&id=1Gl19qPzWKP_13f5RDdmB0Zd4dYMSpHBz"></script>

<!--====== Isotope js ======-->
<script src="https://drive.google.com/uc?export=view&id=18prruOOhp5GXR8nSL2pPH0uQ5KLqQYd6"></script>
<script src="https://drive.google.com/uc?export=view&id=1HKGu5DFe98LPzaIAuvxBYdij6Ar3HVkx"></script>

<!--====== Scrolling Nav js ======-->
<script src="https://drive.google.com/uc?export=view&id=1GEXcj96IYnYQrpde3olt7RZpaZCPvlx8"></script>
<script src="https://drive.google.com/uc?export=view&id=1TzrszQlIZNWtwwMI9qlz4QTRH8QwQTxN"></script>

<!--====== Main js ======-->
<script src="https://drive.google.com/uc?export=view&id=1iBHE1qHNHNEGmrlPbJ1xRVM0SHhS65d6"></script>

</body>

</html>
