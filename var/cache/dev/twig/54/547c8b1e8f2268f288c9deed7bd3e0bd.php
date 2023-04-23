<?php

use Twig\Environment;
use Twig\Error\LoaderError;
use Twig\Error\RuntimeError;
use Twig\Extension\SandboxExtension;
use Twig\Markup;
use Twig\Sandbox\SecurityError;
use Twig\Sandbox\SecurityNotAllowedTagError;
use Twig\Sandbox\SecurityNotAllowedFilterError;
use Twig\Sandbox\SecurityNotAllowedFunctionError;
use Twig\Source;
use Twig\Template;

/* base.html.twig */
class __TwigTemplate_93ab6f3ebc631977bc11518276d4cb96 extends Template
{
    private $source;
    private $macros = [];

    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->source = $this->getSourceContext();

        $this->parent = false;

        $this->blocks = [
            'body' => [$this, 'block_body'],
            'home1' => [$this, 'block_home1'],
        ];
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_5a27a8ba21ca79b61932376b2fa922d2 = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->enter($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "base.html.twig"));

        $__internal_6f47bbe9983af81f1e7450e9a3e3768f = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->enter($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "base.html.twig"));

        // line 1
        echo "<!DOCTYPE html>
<html lang=\"en\">

<head>
  <meta charset=\"utf-8\">
  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">

  <title>Bethany Bootstrap Template - Index</title>
  <meta content=\"\" name=\"description\">
  <meta content=\"\" name=\"keywords\">

  <!-- Favicons -->
  <link href=\"";
        // line 13
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/favicon.png"), "html", null, true);
        echo "\" rel=\"icon\">
  <link href=\"";
        // line 14
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/apple-touch-icon.png"), "html", null, true);
        echo "\" rel=\"apple-touch-icon\">

  <!-- Google Fonts -->
  <link href=\"";
        // line 17
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"), "html", null, true);
        echo "\" rel=\"stylesheet\">

  <!-- Vendor CSS Files -->
  <link href=\"";
        // line 20
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/aos/aos.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
  <link href=\"";
        // line 21
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/bootstrap/css/bootstrap.min.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
  <link href=\"";
        // line 22
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/bootstrap-icons/bootstrap-icons.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
  <link href=\"";
        // line 23
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/boxicons/css/boxicons.min.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
  <link href=\"";
        // line 24
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/glightbox/css/glightbox.min.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
  <link href=\"";
        // line 25
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/remixicon/remixicon.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
  <link href=\"";
        // line 26
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/swiper/swiper-bundle.min.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">

  <!-- Template Main CSS File -->
  <link href=\"";
        // line 29
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/css/style.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
</head>

<body>

  <!-- ======= Header ======= -->
  <header id=\"header\" class=\"fixed-top d-flex align-items-center\">
    <div class=\"container\">
      <div class=\"header-container d-flex align-items-center justify-content-between\">
        <div class=\"logo\">
          <h1 class=\"text-light\"><a href=\"index.html\"><span>Bethany</span></a></h1>
          
        </div>
        <nav id=\"navbar\" class=\"navbar\">
          <ul>
            
            <li><a class=\"nav-link scrollto active\" href=\"#hero\">Home</a></li>
            <li><a class=\"nav-link scrollto\" href=\"#about\">About</a></li>
            <li><a class=\"nav-link scrollto\" href=\"#services\">Services</a></li>
            <li><a class=\"nav-link scrollto \" href=\"#portfolio\">Portfolio</a></li>
            <li><a class=\"nav-link scrollto\" href=\"#team\">Team</a></li>
            <li class=\"dropdown\"><a href=\"#\"><span>Drop Down</span> <i class=\"bi bi-chevron-down\"></i></a>
              <ul>
                <li><a href=\"#\">Drop Down 1</a></li>
                <li class=\"dropdown\"><a href=\"#\"><span>Deep Drop Down</span> <i class=\"bi bi-chevron-right\"></i></a>
                  <ul>
                    <li><a href=\"#\">Deep Drop Down 1</a></li>
                    <li><a href=\"#\">Deep Drop Down 2</a></li>
                    <li><a href=\"#\">Deep Drop Down 3</a></li>
                    <li><a href=\"#\">Deep Drop Down 4</a></li>
                    <li><a href=\"#\">Deep Drop Down 5</a></li>
                  </ul>
                </li>
                <li><a href=\"#\">Drop Down 2</a></li>
                <li><a href=\"#\">Drop Down 3</a></li>
                <li><a href=\"#\">Drop Down 4</a></li>
              </ul>
            </li>
            <li><a class=\"nav-link scrollto\" href=\"/register\">Register</a></li>
            <li><a class=\"getstarted scrollto\" href=\"/login\">Login</a></li>
            <li>";
        // line 69
        if (twig_get_attribute($this->env, $this->source, (isset($context["app"]) || array_key_exists("app", $context) ? $context["app"] : (function () { throw new RuntimeError('Variable "app" does not exist.', 69, $this->source); })()), "user", [], "any", false, false, false, 69)) {
            // line 70
            echo "        <a class=\"nav-link scrollto\">
            You are logged in as ";
            // line 71
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, twig_get_attribute($this->env, $this->source, (isset($context["app"]) || array_key_exists("app", $context) ? $context["app"] : (function () { throw new RuntimeError('Variable "app" does not exist.', 71, $this->source); })()), "user", [], "any", false, false, false, 71), "username", [], "any", false, false, false, 71), "html", null, true);
            echo "
        </a>
        <a class=\"btn-get-started scrollto\" href=\"";
            // line 73
            echo $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("logout");
            echo "\">Logout</a>
    ";
        }
        // line 75
        echo "          </ul>
          <i class=\"bi bi-list mobile-nav-toggle\"></i>
        </nav><!-- .navbar -->

      </div><!-- End Header Container -->
    </div>
  </header><!-- End Header -->

  <!-- ======= Hero Section ======= -->
  <section id=\"hero\" class=\"d-flex align-items-center\">
    <div class=\"container text-center position-relative\" data-aos=\"fade-in\" data-aos-delay=\"200\">
      <h1>Your New Online Presence with Bethany</h1>
      <h2>We are team of talented designers making websites with Bootstrap</h2>
      <a href=\"#about\" class=\"btn-get-started scrollto\">Login</a>
    </div>
  </section><!-- End Hero -->

  <main id=\"main\">

    <!-- ======= Clients Section ======= -->
    <section id=\"clients\" class=\"clients\">
      \t<div class =\"container\">
    <div class =\"row\">
    ";
        // line 98
        $this->displayBlock('body', $context, $blocks);
        // line 101
        echo "    </div>
    </div>
    </section><!-- End Clients Section -->

    <!-- ======= About Section ======= -->
    <section id=\"about\" class=\"about\">
      <div class =\"container\">
    <div class =\"row\">
    ";
        // line 109
        $this->displayBlock('home1', $context, $blocks);
        // line 112
        echo "    </div>
    </div>
    </section><!-- End About Section -->

    <!-- ======= Counts Section ======= -->
   

    <!-- ======= Why Us Section ======= -->
    <section id=\"why-us\" class=\"why-us\">
      <div class=\"container\">

        <div class=\"row\">
          <div class=\"col-lg-4 d-flex align-items-stretch\" data-aos=\"fade-right\">
            <div class=\"content\">
              <h3>Why Choose Bethany for your company website?</h3>
              <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit
                Asperiores dolores sed et. Tenetur quia eos. Autem tempore quibusdam vel necessitatibus optio ad corporis.
              </p>
              <div class=\"text-center\">
                <a href=\"#\" class=\"more-btn\">Learn More <i class=\"bx bx-chevron-right\"></i></a>
              </div>
            </div>
          </div>
          <div class=\"col-lg-8 d-flex align-items-stretch\">
            <div class=\"icon-boxes d-flex flex-column justify-content-center\">
              <div class=\"row\">
                <div class=\"col-xl-4 d-flex align-items-stretch\" data-aos=\"zoom-in\" data-aos-delay=\"100\">
                  <div class=\"icon-box mt-4 mt-xl-0\">
                    <i class=\"bx bx-receipt\"></i>
                    <h4>Corporis voluptates sit</h4>
                    <p>Consequuntur sunt aut quasi enim aliquam quae harum pariatur laboris nisi ut aliquip</p>
                  </div>
                </div>
                <div class=\"col-xl-4 d-flex align-items-stretch\" data-aos=\"zoom-in\" data-aos-delay=\"200\">
                  <div class=\"icon-box mt-4 mt-xl-0\">
                    <i class=\"bx bx-cube-alt\"></i>
                    <h4>Ullamco laboris ladore pan</h4>
                    <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt</p>
                  </div>
                </div>
                <div class=\"col-xl-4 d-flex align-items-stretch\" data-aos=\"zoom-in\" data-aos-delay=\"300\">
                  <div class=\"icon-box mt-4 mt-xl-0\">
                    <i class=\"bx bx-images\"></i>
                    <h4>Labore consequatur</h4>
                    <p>Aut suscipit aut cum nemo deleniti aut omnis. Doloribus ut maiores omnis facere</p>
                  </div>
                </div>
              </div>
            </div><!-- End .content-->
          </div>
        </div>

      </div>
    </section><!-- End Why Us Section -->

    <!-- ======= Cta Section ======= -->
    <section id=\"cta\" class=\"cta\">
      <div class=\"container\">

        <div class=\"text-center\" data-aos=\"zoom-in\">
          <h3>Call To Action</h3>
          <p> Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
          <a class=\"cta-btn\" href=\"#\">Call To Action</a>
        </div>

      </div>
    </section><!-- End Cta Section -->

    <!-- ======= Services Section ======= -->
    <section id=\"services\" class=\"services section-bg\">
      <div class=\"container\">

        <div class=\"row\">
          <div class=\"col-lg-4\">
            <div class=\"section-title\" data-aos=\"fade-right\">
              <h2>Services</h2>
              <p>Magnam dolores commodi suscipit nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
            </div>
          </div>
          <div class=\"col-lg-8\">
            <div class=\"row\">
              <div class=\"col-md-6 d-flex align-items-stretch\">
                <div class=\"icon-box\" data-aos=\"zoom-in\" data-aos-delay=\"100\">
                  <div class=\"icon\"><i class=\"bx bxl-dribbble\"></i></div>
                  <h4><a href=\"\">Lorem Ipsum</a></h4>
                  <p>Voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi</p>
                </div>
              </div>

              <div class=\"col-md-6 d-flex align-items-stretch mt-4 mt-lg-0\">
                <div class=\"icon-box\" data-aos=\"zoom-in\" data-aos-delay=\"200\">
                  <div class=\"icon\"><i class=\"bx bx-file\"></i></div>
                  <h4><a href=\"\">Sed ut perspiciatis</a></h4>
                  <p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore</p>
                </div>
              </div>

              <div class=\"col-md-6 d-flex align-items-stretch mt-4\">
                <div class=\"icon-box\" data-aos=\"zoom-in\" data-aos-delay=\"300\">
                  <div class=\"icon\"><i class=\"bx bx-tachometer\"></i></div>
                  <h4><a href=\"\">Magni Dolores</a></h4>
                  <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia</p>
                </div>
              </div>

              <div class=\"col-md-6 d-flex align-items-stretch mt-4\">
                <div class=\"icon-box\" data-aos=\"zoom-in\" data-aos-delay=\"400\">
                  <div class=\"icon\"><i class=\"bx bx-world\"></i></div>
                  <h4><a href=\"\">Nemo Enim</a></h4>
                  <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis</p>
                </div>
              </div>

            </div>
          </div>
        </div>

      </div>
    </section><!-- End Services Section -->

    <!-- ======= Portfolio Section ======= -->
    <section id=\"portfolio\" class=\"portfolio\">
      <div class=\"container\">

        <div class=\"section-title\" data-aos=\"fade-left\">
          <h2>Portfolio</h2>
          <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
        </div>

        <div class=\"row\" data-aos=\"fade-up\" data-aos-delay=\"100\">
          <div class=\"col-lg-12 d-flex justify-content-center\">
            <ul id=\"portfolio-flters\">
              <li data-filter=\"*\" class=\"filter-active\">All</li>
              <li data-filter=\".filter-app\">App</li>
              <li data-filter=\".filter-card\">Card</li>
              <li data-filter=\".filter-web\">Web</li>
            </ul>
          </div>
        </div>

        <div class=\"row portfolio-container\" data-aos=\"fade-up\" data-aos-delay=\"200\">

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-app\">
            <div class=\"portfolio-wrap\">
              <img src=\"";
        // line 257
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-1.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>App 1</h4>
                <p>App</p>
                <div class=\"portfolio-links\">
                  <a href=\"";
        // line 262
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-1.jpg"), "html", null, true);
        echo "\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"App 1\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"";
        // line 263
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("portfolio-details.html"), "html", null, true);
        echo "\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-web\">
            <div class=\"portfolio-wrap\">
              <img src=\"";
        // line 271
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-2.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Web 3</h4>
                <p>Web</p>
                <div class=\"portfolio-links\">
                  <a href=\"";
        // line 276
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-2.jpg"), "html", null, true);
        echo "\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Web 3\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"";
        // line 277
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("portfolio-details.html"), "html", null, true);
        echo "\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-app\">
            <div class=\"portfolio-wrap\">
              <img src=\"";
        // line 285
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-3.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>App 2</h4>
                <p>App</p>
                <div class=\"portfolio-links\">
                  <a href=\"";
        // line 290
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-3.jpg"), "html", null, true);
        echo "\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"App 2\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"";
        // line 291
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("portfolio-details.html"), "html", null, true);
        echo "\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-card\">
            <div class=\"portfolio-wrap\">
              <img src=\"";
        // line 299
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-4.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Card 2</h4>
                <p>Card</p>
                <div class=\"portfolio-links\">
                  <a href=\"";
        // line 304
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-4.jpg"), "html", null, true);
        echo "\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Card 2\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"";
        // line 305
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("portfolio-details.html"), "html", null, true);
        echo "\"title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-web\">
            <div class=\"portfolio-wrap\">
              <img src=\"";
        // line 313
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-5.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Web 2</h4>
                <p>Web</p>
                <div class=\"portfolio-links\">
                  <a href=\"";
        // line 318
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-5.jpg"), "html", null, true);
        echo "\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Web 2\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"";
        // line 319
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("portfolio-details.html"), "html", null, true);
        echo "\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-app\">
            <div class=\"portfolio-wrap\">
              <img src=\"";
        // line 327
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-6.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>App 3</h4>
                <p>App</p>
                <div class=\"portfolio-links\">
                  <a href=\"";
        // line 332
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-6.jpg"), "html", null, true);
        echo "\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"App 3\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"";
        // line 333
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("portfolio-details.html"), "html", null, true);
        echo "\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-card\">
            <div class=\"portfolio-wrap\">
              <img src=\"";
        // line 341
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-7.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Card 1</h4>
                <p>Card</p>
                <div class=\"portfolio-links\">
                  <a href=\"";
        // line 346
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-7.jpg"), "html", null, true);
        echo "\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Card 1\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"";
        // line 347
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("portfolio-details.html"), "html", null, true);
        echo "\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-card\">
            <div class=\"portfolio-wrap\">
              <img src=\"";
        // line 355
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-8.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Card 3</h4>
                <p>Card</p>
                <div class=\"portfolio-links\">
                  <a href=\"";
        // line 360
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-8.jpg"), "html", null, true);
        echo "\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Card 3\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"";
        // line 361
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("portfolio-details.html"), "html", null, true);
        echo "\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-web\">
            <div class=\"portfolio-wrap\">
              <img src=\"";
        // line 369
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-9.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Web 3</h4>
                <p>Web</p>
                <div class=\"portfolio-links\">
                  <a href=\"";
        // line 374
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/portfolio/portfolio-9.jpg"), "html", null, true);
        echo "\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Web 3\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"";
        // line 375
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("portfolio-details.html"), "html", null, true);
        echo "\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

        </div>

      </div>
    </section><!-- End Portfolio Section -->

    <!-- ======= Testimonials Section ======= -->
    <section id=\"testimonials\" class=\"testimonials section-bg\">
      <div class=\"container\">

        <div class=\"row\">
          <div class=\"col-lg-4\">
            <div class=\"section-title\" data-aos=\"fade-right\">
              <h2>Testimonials</h2>
              <p>Magnam dolores commodi suscipit uisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
            </div>
          </div>
          <div class=\"col-lg-8\" data-aos=\"fade-up\" data-aos-delay=\"100\">

            <div class=\"testimonials-slider swiper\" data-aos=\"fade-up\" data-aos-delay=\"100\">
              <div class=\"swiper-wrapper\">

                <div class=\"swiper-slide\">
                  <div class=\"testimonial-item\">
                    <p>
                      <i class=\"bx bxs-quote-alt-left quote-icon-left\"></i>
                      Proin iaculis purus consequat sem cure digni ssim donec porttitora entum suscipit rhoncus. Accusantium quam, ultricies eget id, aliquam eget nibh et. Maecen aliquam, risus at semper.
                      <i class=\"bx bxs-quote-alt-right quote-icon-right\"></i>
                    </p>
                    <img src=\"";
        // line 409
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/testimonials/testimonials-1.jpg"), "html", null, true);
        echo "\" class=\"testimonial-img\" alt=\"\">
                    <h3>Saul Goodman</h3>
                    <h4>Ceo &amp; Founder</h4>
                  </div>
                </div><!-- End testimonial item -->

                <div class=\"swiper-slide\">
                  <div class=\"testimonial-item\">
                    <p>
                      <i class=\"bx bxs-quote-alt-left quote-icon-left\"></i>
                      Export tempor illum tamen malis malis eram quae irure esse labore quem cillum quid cillum eram malis quorum velit fore eram velit sunt aliqua noster fugiat irure amet legam anim culpa.
                      <i class=\"bx bxs-quote-alt-right quote-icon-right\"></i>
                    </p>
                    <img src=\"";
        // line 422
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/testimonials/testimonials-2.jpg"), "html", null, true);
        echo "\" class=\"testimonial-img\" alt=\"\">
                    <h3>Sara Wilsson</h3>
                    <h4>Designer</h4>
                  </div>
                </div><!-- End testimonial item -->

                <div class=\"swiper-slide\">
                  <div class=\"testimonial-item\">
                    <p>
                      <i class=\"bx bxs-quote-alt-left quote-icon-left\"></i>
                      Enim nisi quem export duis labore cillum quae magna enim sint quorum nulla quem veniam duis minim tempor labore quem eram duis noster aute amet eram fore quis sint minim.
                      <i class=\"bx bxs-quote-alt-right quote-icon-right\"></i>
                    </p>
                    <img src=\"";
        // line 435
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/testimonials/testimonials-3.jpg"), "html", null, true);
        echo "\" class=\"testimonial-img\" alt=\"\">
                    <h3>Jena Karlis</h3>
                    <h4>Store Owner</h4>
                  </div>
                </div><!-- End testimonial item -->

                <div class=\"swiper-slide\">
                  <div class=\"testimonial-item\">
                    <p>
                      <i class=\"bx bxs-quote-alt-left quote-icon-left\"></i>
                      Fugiat enim eram quae cillum dolore dolor amet nulla culpa multos export minim fugiat minim velit minim dolor enim duis veniam ipsum anim magna sunt elit fore quem dolore labore illum veniam.
                      <i class=\"bx bxs-quote-alt-right quote-icon-right\"></i>
                    </p>
                    <img src=\"";
        // line 448
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/testimonials/testimonials-4.jpg"), "html", null, true);
        echo "\" class=\"testimonial-img\" alt=\"\">
                    <h3>Matt Brandon</h3>
                    <h4>Freelancer</h4>
                  </div>
                </div><!-- End testimonial item -->

                <div class=\"swiper-slide\">
                  <div class=\"testimonial-item\">
                    <p>
                      <i class=\"bx bxs-quote-alt-left quote-icon-left\"></i>
                      Quis quorum aliqua sint quem legam fore sunt eram irure aliqua veniam tempor noster veniam enim culpa labore duis sunt culpa nulla illum cillum fugiat legam esse veniam culpa fore nisi cillum quid.
                      <i class=\"bx bxs-quote-alt-right quote-icon-right\"></i>
                    </p>
                    <img src=\"";
        // line 461
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/testimonials/testimonials-5.jpg"), "html", null, true);
        echo "\" class=\"testimonial-img\" alt=\"\">
                    <h3>John Larson</h3>
                    <h4>Entrepreneur</h4>
                  </div>
                </div><!-- End testimonial item -->

              </div>
              <div class=\"swiper-pagination\"></div>
            </div>
          </div>
        </div>

      </div>
    </section><!-- End Testimonials Section -->

    <!-- ======= Team Section ======= -->
    <section id=\"team\" class=\"team\">
      <div class=\"container\">

        <div class=\"row\">
          <div class=\"col-lg-4\">
            <div class=\"section-title\" data-aos=\"fade-right\">
              <h2>Team</h2>
              <p>Necessitatibus eius consequatur ex aliquid fuga eum quidem.</p>
            </div>
          </div>
          <div class=\"col-lg-8\">
            <div class=\"row\">

              <div class=\"col-lg-6\">
                <div class=\"member\" data-aos=\"zoom-in\" data-aos-delay=\"100\">
                  <div class=\"pic\"><img src=\"";
        // line 492
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/team/team-1.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\"></div>
                  <div class=\"member-info\">
                    <h4>Walter White</h4>
                    <span>Chief Executive Officer</span>
                    <p>Explicabo voluptatem mollitia et repellat qui dolorum quasi</p>
                    <div class=\"social\">
                      <a href=\"\"><i class=\"ri-twitter-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-facebook-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-instagram-fill\"></i></a>
                      <a href=\"\"> <i class=\"ri-linkedin-box-fill\"></i> </a>
                    </div>
                  </div>
                </div>
              </div>

              <div class=\"col-lg-6 mt-4 mt-lg-0\">
                <div class=\"member\" data-aos=\"zoom-in\" data-aos-delay=\"200\">
                  <div class=\"pic\"><img src=\"";
        // line 509
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/team/team-2.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\"></div>
                  <div class=\"member-info\">
                    <h4>Sarah Jhonson</h4>
                    <span>Product Manager</span>
                    <p>Aut maiores voluptates amet et quis praesentium qui senda para</p>
                    <div class=\"social\">
                      <a href=\"\"><i class=\"ri-twitter-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-facebook-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-instagram-fill\"></i></a>
                      <a href=\"\"> <i class=\"ri-linkedin-box-fill\"></i> </a>
                    </div>
                  </div>
                </div>
              </div>

              <div class=\"col-lg-6 mt-4\">
                <div class=\"member\" data-aos=\"zoom-in\" data-aos-delay=\"300\">
                  <div class=\"pic\"><img src=\"";
        // line 526
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/team/team-3.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\"></div>
                  <div class=\"member-info\">
                    <h4>William Anderson</h4>
                    <span>CTO</span>
                    <p>Quisquam facilis cum velit laborum corrupti fuga rerum quia</p>
                    <div class=\"social\">
                      <a href=\"\"><i class=\"ri-twitter-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-facebook-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-instagram-fill\"></i></a>
                      <a href=\"\"> <i class=\"ri-linkedin-box-fill\"></i> </a>
                    </div>
                  </div>
                </div>
              </div>

              <div class=\"col-lg-6 mt-4\">
                <div class=\"member\" data-aos=\"zoom-in\" data-aos-delay=\"400\">
                  <div class=\"pic\"><img src=\"";
        // line 543
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/img/team/team-4.jpg"), "html", null, true);
        echo "\" class=\"img-fluid\" alt=\"\"></div>
                  <div class=\"member-info\">
                    <h4>Amanda Jepson</h4>
                    <span>Accountant</span>
                    <p>Dolorum tempora officiis odit laborum officiis et et accusamus</p>
                    <div class=\"social\">
                      <a href=\"\"><i class=\"ri-twitter-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-facebook-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-instagram-fill\"></i></a>
                      <a href=\"\"> <i class=\"ri-linkedin-box-fill\"></i> </a>
                    </div>
                  </div>
                </div>
              </div>

            </div>

          </div>
        </div>

      </div>
    </section><!-- End Team Section -->

    <!-- ======= Contact Section ======= -->
    <section id=\"contact\" class=\"contact\">
      <div class=\"container\">
        <div class=\"row\">
          <div class=\"col-lg-4\" data-aos=\"fade-right\">
            <div class=\"section-title\">
              <h2>Contact</h2>
              <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
            </div>
          </div>

          <div class=\"col-lg-8\" data-aos=\"fade-up\" data-aos-delay=\"100\">
            <iframe style=\"border:0; width: 100%; height: 270px;\" src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12097.433213460943!2d-74.0062269!3d40.7101282!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xb89d1fe6bc499443!2sDowntown+Conference+Center!5e0!3m2!1smk!2sbg!4v1539943755621\" frameborder=\"0\" allowfullscreen></iframe>
            <div class=\"info mt-4\">
              <i class=\"bi bi-geo-alt\"></i>
              <h4>Location:</h4>
              <p>A108 Adam Street, New York, NY 535022</p>
            </div>
            <div class=\"row\">
              <div class=\"col-lg-6 mt-4\">
                <div class=\"info\">
                  <i class=\"bi bi-envelope\"></i>
                  <h4>Email:</h4>
                  <p>info@example.com</p>
                </div>
              </div>
              <div class=\"col-lg-6\">
                <div class=\"info w-100 mt-4\">
                  <i class=\"bi bi-phone\"></i>
                  <h4>Call:</h4>
                  <p>+1 5589 55488 55s</p>
                </div>
              </div>
            </div>

            <form action=\"forms/contact.php\" method=\"post\" role=\"form\" class=\"php-email-form mt-4\">
              <div class=\"row\">
                <div class=\"col-md-6 form-group\">
                  <input type=\"text\" name=\"name\" class=\"form-control\" id=\"name\" placeholder=\"Your Name\" required>
                </div>
                <div class=\"col-md-6 form-group mt-3 mt-md-0\">
                  <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Your Email\" required>
                </div>
              </div>
              <div class=\"form-group mt-3\">
                <input type=\"text\" class=\"form-control\" name=\"subject\" id=\"subject\" placeholder=\"Subject\" required>
              </div>
              <div class=\"form-group mt-3\">
                <textarea class=\"form-control\" name=\"message\" rows=\"5\" placeholder=\"Message\" required></textarea>
              </div>
              <div class=\"my-3\">
                <div class=\"loading\">Loading</div>
                <div class=\"error-message\"></div>
                <div class=\"sent-message\">Your message has been sent. Thank you!</div>
              </div>
              <div class=\"text-center\"><button type=\"submit\">Send Message</button></div>
            </form>
          </div>
        </div>

      </div>
    </section><!-- End Contact Section -->

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id=\"footer\">

    <div class=\"footer-top\">
      <div class=\"container\">
        <div class=\"row\">

          <div class=\"col-lg-3 col-md-6 footer-contact\">
            <h3>Bethany</h3>
            <p>
              A108 Adam Street <br>
              New York, NY 535022<br>
              United States <br><br>
              <strong>Phone:</strong> +1 5589 55488 55<br>
              <strong>Email:</strong> info@example.com<br>
            </p>
          </div>

          <div class=\"col-lg-2 col-md-6 footer-links\">
            <h4>Useful Links</h4>
            <ul>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Home</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">About us</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Services</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Terms of service</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Privacy policy</a></li>
            </ul>
          </div>

          <div class=\"col-lg-3 col-md-6 footer-links\">
            <h4>Our Services</h4>
            <ul>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Design</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Development</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Product Management</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Marketing</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Graphic Design</a></li>
            </ul>
          </div>

          <div class=\"col-lg-4 col-md-6 footer-newsletter\">
            <h4>Join Our Newsletter</h4>
            <p>Tamen quem nulla quae legam multos aute sint culpa legam noster magna</p>
            <form action=\"\" method=\"post\">
              <input type=\"email\" name=\"email\"><input type=\"submit\" value=\"Subscribe\">
            </form>
          </div>

        </div>
      </div>
    </div>

    <div class=\"container d-md-flex py-4\">

      <div class=\"me-md-auto text-center text-md-start\">
        <div class=\"copyright\">
          &copy; Copyright <strong><span>Bethany</span></strong>. All Rights Reserved
        </div>
        <div class=\"credits\">
          <!-- All the links in the footer should remain intact. -->
          <!-- You can delete the links only if you purchased the pro version. -->
          <!-- Licensing information: https://bootstrapmade.com/license/ -->
          <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/bethany-free-onepage-bootstrap-theme/ -->
          Designed by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>
        </div>
      </div>
      <div class=\"social-links text-center text-md-right pt-3 pt-md-0\">
        <a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a>
        <a href=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a>
        <a href=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a>
        <a href=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a>
        <a href=\"#\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>
      </div>
    </div>
  </footer><!-- End Footer -->

  <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>

  <!-- Vendor JS Files -->
  <script src=\"";
        // line 710
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/purecounter/purecounter_vanilla.js"), "html", null, true);
        echo "\"></script>
  <script src=\"";
        // line 711
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/aos/aos.js"), "html", null, true);
        echo "\"></script>
  <script src=\"";
        // line 712
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/bootstrap/js/bootstrap.bundle.min.js"), "html", null, true);
        echo "\"></script>
  <script src=\"";
        // line 713
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/glightbox/js/glightbox.min.js"), "html", null, true);
        echo "\"></script>
  <script src=\"";
        // line 714
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/isotope-layout/isotope.pkgd.min.js"), "html", null, true);
        echo "\"></script>
  <script src=\"";
        // line 715
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/swiper/swiper-bundle.min.js"), "html", null, true);
        echo "\"></script>
  <script src=\"";
        // line 716
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/vendor/php-email-form/validate.js"), "html", null, true);
        echo "\"></script>

  <!-- Template Main JS File -->
  <script src=\"";
        // line 719
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/js/main.js"), "html", null, true);
        echo "\"></script>

</body>

</html>";
        
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->leave($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof);

        
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->leave($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof);

    }

    // line 98
    public function block_body($context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_5a27a8ba21ca79b61932376b2fa922d2 = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->enter($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_6f47bbe9983af81f1e7450e9a3e3768f = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->enter($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        // line 99
        echo "
    ";
        
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->leave($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof);

        
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->leave($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof);

    }

    // line 109
    public function block_home1($context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_5a27a8ba21ca79b61932376b2fa922d2 = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->enter($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "home1"));

        $__internal_6f47bbe9983af81f1e7450e9a3e3768f = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->enter($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "home1"));

        // line 110
        echo "
    ";
        
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->leave($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof);

        
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->leave($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof);

    }

    public function getTemplateName()
    {
        return "base.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  986 => 110,  976 => 109,  965 => 99,  955 => 98,  940 => 719,  934 => 716,  930 => 715,  926 => 714,  922 => 713,  918 => 712,  914 => 711,  910 => 710,  740 => 543,  720 => 526,  700 => 509,  680 => 492,  646 => 461,  630 => 448,  614 => 435,  598 => 422,  582 => 409,  545 => 375,  541 => 374,  533 => 369,  522 => 361,  518 => 360,  510 => 355,  499 => 347,  495 => 346,  487 => 341,  476 => 333,  472 => 332,  464 => 327,  453 => 319,  449 => 318,  441 => 313,  430 => 305,  426 => 304,  418 => 299,  407 => 291,  403 => 290,  395 => 285,  384 => 277,  380 => 276,  372 => 271,  361 => 263,  357 => 262,  349 => 257,  202 => 112,  200 => 109,  190 => 101,  188 => 98,  163 => 75,  158 => 73,  153 => 71,  150 => 70,  148 => 69,  105 => 29,  99 => 26,  95 => 25,  91 => 24,  87 => 23,  83 => 22,  79 => 21,  75 => 20,  69 => 17,  63 => 14,  59 => 13,  45 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("<!DOCTYPE html>
<html lang=\"en\">

<head>
  <meta charset=\"utf-8\">
  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">

  <title>Bethany Bootstrap Template - Index</title>
  <meta content=\"\" name=\"description\">
  <meta content=\"\" name=\"keywords\">

  <!-- Favicons -->
  <link href=\"{{ asset('assets/img/favicon.png') }}\" rel=\"icon\">
  <link href=\"{{ asset('assets/img/apple-touch-icon.png') }}\" rel=\"apple-touch-icon\">

  <!-- Google Fonts -->
  <link href=\"{{ asset('https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i') }}\" rel=\"stylesheet\">

  <!-- Vendor CSS Files -->
  <link href=\"{{ asset('assets/vendor/aos/aos.css') }}\" rel=\"stylesheet\">
  <link href=\"{{ asset('assets/vendor/bootstrap/css/bootstrap.min.css') }}\" rel=\"stylesheet\">
  <link href=\"{{ asset('assets/vendor/bootstrap-icons/bootstrap-icons.css') }}\" rel=\"stylesheet\">
  <link href=\"{{ asset('assets/vendor/boxicons/css/boxicons.min.css') }}\" rel=\"stylesheet\">
  <link href=\"{{ asset('assets/vendor/glightbox/css/glightbox.min.css') }}\" rel=\"stylesheet\">
  <link href=\"{{ asset('assets/vendor/remixicon/remixicon.css') }}\" rel=\"stylesheet\">
  <link href=\"{{ asset('assets/vendor/swiper/swiper-bundle.min.css') }}\" rel=\"stylesheet\">

  <!-- Template Main CSS File -->
  <link href=\"{{ asset('assets/css/style.css') }}\" rel=\"stylesheet\">
</head>

<body>

  <!-- ======= Header ======= -->
  <header id=\"header\" class=\"fixed-top d-flex align-items-center\">
    <div class=\"container\">
      <div class=\"header-container d-flex align-items-center justify-content-between\">
        <div class=\"logo\">
          <h1 class=\"text-light\"><a href=\"index.html\"><span>Bethany</span></a></h1>
          
        </div>
        <nav id=\"navbar\" class=\"navbar\">
          <ul>
            
            <li><a class=\"nav-link scrollto active\" href=\"#hero\">Home</a></li>
            <li><a class=\"nav-link scrollto\" href=\"#about\">About</a></li>
            <li><a class=\"nav-link scrollto\" href=\"#services\">Services</a></li>
            <li><a class=\"nav-link scrollto \" href=\"#portfolio\">Portfolio</a></li>
            <li><a class=\"nav-link scrollto\" href=\"#team\">Team</a></li>
            <li class=\"dropdown\"><a href=\"#\"><span>Drop Down</span> <i class=\"bi bi-chevron-down\"></i></a>
              <ul>
                <li><a href=\"#\">Drop Down 1</a></li>
                <li class=\"dropdown\"><a href=\"#\"><span>Deep Drop Down</span> <i class=\"bi bi-chevron-right\"></i></a>
                  <ul>
                    <li><a href=\"#\">Deep Drop Down 1</a></li>
                    <li><a href=\"#\">Deep Drop Down 2</a></li>
                    <li><a href=\"#\">Deep Drop Down 3</a></li>
                    <li><a href=\"#\">Deep Drop Down 4</a></li>
                    <li><a href=\"#\">Deep Drop Down 5</a></li>
                  </ul>
                </li>
                <li><a href=\"#\">Drop Down 2</a></li>
                <li><a href=\"#\">Drop Down 3</a></li>
                <li><a href=\"#\">Drop Down 4</a></li>
              </ul>
            </li>
            <li><a class=\"nav-link scrollto\" href=\"/register\">Register</a></li>
            <li><a class=\"getstarted scrollto\" href=\"/login\">Login</a></li>
            <li>{% if app.user %}
        <a class=\"nav-link scrollto\">
            You are logged in as {{ app.user.username }}
        </a>
        <a class=\"btn-get-started scrollto\" href=\"{{ path('logout') }}\">Logout</a>
    {% endif %}
          </ul>
          <i class=\"bi bi-list mobile-nav-toggle\"></i>
        </nav><!-- .navbar -->

      </div><!-- End Header Container -->
    </div>
  </header><!-- End Header -->

  <!-- ======= Hero Section ======= -->
  <section id=\"hero\" class=\"d-flex align-items-center\">
    <div class=\"container text-center position-relative\" data-aos=\"fade-in\" data-aos-delay=\"200\">
      <h1>Your New Online Presence with Bethany</h1>
      <h2>We are team of talented designers making websites with Bootstrap</h2>
      <a href=\"#about\" class=\"btn-get-started scrollto\">Login</a>
    </div>
  </section><!-- End Hero -->

  <main id=\"main\">

    <!-- ======= Clients Section ======= -->
    <section id=\"clients\" class=\"clients\">
      \t<div class =\"container\">
    <div class =\"row\">
    {% block body %}

    {% endblock %}
    </div>
    </div>
    </section><!-- End Clients Section -->

    <!-- ======= About Section ======= -->
    <section id=\"about\" class=\"about\">
      <div class =\"container\">
    <div class =\"row\">
    {% block home1 %}

    {% endblock %}
    </div>
    </div>
    </section><!-- End About Section -->

    <!-- ======= Counts Section ======= -->
   

    <!-- ======= Why Us Section ======= -->
    <section id=\"why-us\" class=\"why-us\">
      <div class=\"container\">

        <div class=\"row\">
          <div class=\"col-lg-4 d-flex align-items-stretch\" data-aos=\"fade-right\">
            <div class=\"content\">
              <h3>Why Choose Bethany for your company website?</h3>
              <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit
                Asperiores dolores sed et. Tenetur quia eos. Autem tempore quibusdam vel necessitatibus optio ad corporis.
              </p>
              <div class=\"text-center\">
                <a href=\"#\" class=\"more-btn\">Learn More <i class=\"bx bx-chevron-right\"></i></a>
              </div>
            </div>
          </div>
          <div class=\"col-lg-8 d-flex align-items-stretch\">
            <div class=\"icon-boxes d-flex flex-column justify-content-center\">
              <div class=\"row\">
                <div class=\"col-xl-4 d-flex align-items-stretch\" data-aos=\"zoom-in\" data-aos-delay=\"100\">
                  <div class=\"icon-box mt-4 mt-xl-0\">
                    <i class=\"bx bx-receipt\"></i>
                    <h4>Corporis voluptates sit</h4>
                    <p>Consequuntur sunt aut quasi enim aliquam quae harum pariatur laboris nisi ut aliquip</p>
                  </div>
                </div>
                <div class=\"col-xl-4 d-flex align-items-stretch\" data-aos=\"zoom-in\" data-aos-delay=\"200\">
                  <div class=\"icon-box mt-4 mt-xl-0\">
                    <i class=\"bx bx-cube-alt\"></i>
                    <h4>Ullamco laboris ladore pan</h4>
                    <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt</p>
                  </div>
                </div>
                <div class=\"col-xl-4 d-flex align-items-stretch\" data-aos=\"zoom-in\" data-aos-delay=\"300\">
                  <div class=\"icon-box mt-4 mt-xl-0\">
                    <i class=\"bx bx-images\"></i>
                    <h4>Labore consequatur</h4>
                    <p>Aut suscipit aut cum nemo deleniti aut omnis. Doloribus ut maiores omnis facere</p>
                  </div>
                </div>
              </div>
            </div><!-- End .content-->
          </div>
        </div>

      </div>
    </section><!-- End Why Us Section -->

    <!-- ======= Cta Section ======= -->
    <section id=\"cta\" class=\"cta\">
      <div class=\"container\">

        <div class=\"text-center\" data-aos=\"zoom-in\">
          <h3>Call To Action</h3>
          <p> Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
          <a class=\"cta-btn\" href=\"#\">Call To Action</a>
        </div>

      </div>
    </section><!-- End Cta Section -->

    <!-- ======= Services Section ======= -->
    <section id=\"services\" class=\"services section-bg\">
      <div class=\"container\">

        <div class=\"row\">
          <div class=\"col-lg-4\">
            <div class=\"section-title\" data-aos=\"fade-right\">
              <h2>Services</h2>
              <p>Magnam dolores commodi suscipit nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
            </div>
          </div>
          <div class=\"col-lg-8\">
            <div class=\"row\">
              <div class=\"col-md-6 d-flex align-items-stretch\">
                <div class=\"icon-box\" data-aos=\"zoom-in\" data-aos-delay=\"100\">
                  <div class=\"icon\"><i class=\"bx bxl-dribbble\"></i></div>
                  <h4><a href=\"\">Lorem Ipsum</a></h4>
                  <p>Voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi</p>
                </div>
              </div>

              <div class=\"col-md-6 d-flex align-items-stretch mt-4 mt-lg-0\">
                <div class=\"icon-box\" data-aos=\"zoom-in\" data-aos-delay=\"200\">
                  <div class=\"icon\"><i class=\"bx bx-file\"></i></div>
                  <h4><a href=\"\">Sed ut perspiciatis</a></h4>
                  <p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore</p>
                </div>
              </div>

              <div class=\"col-md-6 d-flex align-items-stretch mt-4\">
                <div class=\"icon-box\" data-aos=\"zoom-in\" data-aos-delay=\"300\">
                  <div class=\"icon\"><i class=\"bx bx-tachometer\"></i></div>
                  <h4><a href=\"\">Magni Dolores</a></h4>
                  <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia</p>
                </div>
              </div>

              <div class=\"col-md-6 d-flex align-items-stretch mt-4\">
                <div class=\"icon-box\" data-aos=\"zoom-in\" data-aos-delay=\"400\">
                  <div class=\"icon\"><i class=\"bx bx-world\"></i></div>
                  <h4><a href=\"\">Nemo Enim</a></h4>
                  <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis</p>
                </div>
              </div>

            </div>
          </div>
        </div>

      </div>
    </section><!-- End Services Section -->

    <!-- ======= Portfolio Section ======= -->
    <section id=\"portfolio\" class=\"portfolio\">
      <div class=\"container\">

        <div class=\"section-title\" data-aos=\"fade-left\">
          <h2>Portfolio</h2>
          <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
        </div>

        <div class=\"row\" data-aos=\"fade-up\" data-aos-delay=\"100\">
          <div class=\"col-lg-12 d-flex justify-content-center\">
            <ul id=\"portfolio-flters\">
              <li data-filter=\"*\" class=\"filter-active\">All</li>
              <li data-filter=\".filter-app\">App</li>
              <li data-filter=\".filter-card\">Card</li>
              <li data-filter=\".filter-web\">Web</li>
            </ul>
          </div>
        </div>

        <div class=\"row portfolio-container\" data-aos=\"fade-up\" data-aos-delay=\"200\">

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-app\">
            <div class=\"portfolio-wrap\">
              <img src=\"{{ asset('assets/img/portfolio/portfolio-1.jpg') }}\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>App 1</h4>
                <p>App</p>
                <div class=\"portfolio-links\">
                  <a href=\"{{ asset('assets/img/portfolio/portfolio-1.jpg') }}\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"App 1\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"{{ asset('portfolio-details.html') }}\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-web\">
            <div class=\"portfolio-wrap\">
              <img src=\"{{ asset('assets/img/portfolio/portfolio-2.jpg') }}\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Web 3</h4>
                <p>Web</p>
                <div class=\"portfolio-links\">
                  <a href=\"{{ asset('assets/img/portfolio/portfolio-2.jpg') }}\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Web 3\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"{{ asset('portfolio-details.html') }}\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-app\">
            <div class=\"portfolio-wrap\">
              <img src=\"{{ asset('assets/img/portfolio/portfolio-3.jpg') }}\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>App 2</h4>
                <p>App</p>
                <div class=\"portfolio-links\">
                  <a href=\"{{ asset('assets/img/portfolio/portfolio-3.jpg') }}\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"App 2\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"{{ asset('portfolio-details.html') }}\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-card\">
            <div class=\"portfolio-wrap\">
              <img src=\"{{ asset('assets/img/portfolio/portfolio-4.jpg') }}\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Card 2</h4>
                <p>Card</p>
                <div class=\"portfolio-links\">
                  <a href=\"{{ asset('assets/img/portfolio/portfolio-4.jpg') }}\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Card 2\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"{{ asset('portfolio-details.html') }}\"title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-web\">
            <div class=\"portfolio-wrap\">
              <img src=\"{{ asset('assets/img/portfolio/portfolio-5.jpg') }}\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Web 2</h4>
                <p>Web</p>
                <div class=\"portfolio-links\">
                  <a href=\"{{ asset('assets/img/portfolio/portfolio-5.jpg') }}\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Web 2\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"{{ asset('portfolio-details.html') }}\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-app\">
            <div class=\"portfolio-wrap\">
              <img src=\"{{ asset('assets/img/portfolio/portfolio-6.jpg') }}\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>App 3</h4>
                <p>App</p>
                <div class=\"portfolio-links\">
                  <a href=\"{{ asset('assets/img/portfolio/portfolio-6.jpg') }}\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"App 3\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"{{ asset('portfolio-details.html') }}\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-card\">
            <div class=\"portfolio-wrap\">
              <img src=\"{{ asset('assets/img/portfolio/portfolio-7.jpg') }}\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Card 1</h4>
                <p>Card</p>
                <div class=\"portfolio-links\">
                  <a href=\"{{ asset('assets/img/portfolio/portfolio-7.jpg') }}\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Card 1\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"{{ asset('portfolio-details.html') }}\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-card\">
            <div class=\"portfolio-wrap\">
              <img src=\"{{ asset('assets/img/portfolio/portfolio-8.jpg') }}\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Card 3</h4>
                <p>Card</p>
                <div class=\"portfolio-links\">
                  <a href=\"{{ asset('assets/img/portfolio/portfolio-8.jpg') }}\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Card 3\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"{{ asset('portfolio-details.html') }}\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class=\"col-lg-4 col-md-6 portfolio-item filter-web\">
            <div class=\"portfolio-wrap\">
              <img src=\"{{ asset('assets/img/portfolio/portfolio-9.jpg') }}\" class=\"img-fluid\" alt=\"\">
              <div class=\"portfolio-info\">
                <h4>Web 3</h4>
                <p>Web</p>
                <div class=\"portfolio-links\">
                  <a href=\"{{ asset('assets/img/portfolio/portfolio-9.jpg') }}\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox\" title=\"Web 3\"><i class=\"bx bx-plus\"></i></a>
                  <a href=\"{{ asset('portfolio-details.html') }}\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>
                </div>
              </div>
            </div>
          </div>

        </div>

      </div>
    </section><!-- End Portfolio Section -->

    <!-- ======= Testimonials Section ======= -->
    <section id=\"testimonials\" class=\"testimonials section-bg\">
      <div class=\"container\">

        <div class=\"row\">
          <div class=\"col-lg-4\">
            <div class=\"section-title\" data-aos=\"fade-right\">
              <h2>Testimonials</h2>
              <p>Magnam dolores commodi suscipit uisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
            </div>
          </div>
          <div class=\"col-lg-8\" data-aos=\"fade-up\" data-aos-delay=\"100\">

            <div class=\"testimonials-slider swiper\" data-aos=\"fade-up\" data-aos-delay=\"100\">
              <div class=\"swiper-wrapper\">

                <div class=\"swiper-slide\">
                  <div class=\"testimonial-item\">
                    <p>
                      <i class=\"bx bxs-quote-alt-left quote-icon-left\"></i>
                      Proin iaculis purus consequat sem cure digni ssim donec porttitora entum suscipit rhoncus. Accusantium quam, ultricies eget id, aliquam eget nibh et. Maecen aliquam, risus at semper.
                      <i class=\"bx bxs-quote-alt-right quote-icon-right\"></i>
                    </p>
                    <img src=\"{{ asset('assets/img/testimonials/testimonials-1.jpg') }}\" class=\"testimonial-img\" alt=\"\">
                    <h3>Saul Goodman</h3>
                    <h4>Ceo &amp; Founder</h4>
                  </div>
                </div><!-- End testimonial item -->

                <div class=\"swiper-slide\">
                  <div class=\"testimonial-item\">
                    <p>
                      <i class=\"bx bxs-quote-alt-left quote-icon-left\"></i>
                      Export tempor illum tamen malis malis eram quae irure esse labore quem cillum quid cillum eram malis quorum velit fore eram velit sunt aliqua noster fugiat irure amet legam anim culpa.
                      <i class=\"bx bxs-quote-alt-right quote-icon-right\"></i>
                    </p>
                    <img src=\"{{ asset('assets/img/testimonials/testimonials-2.jpg') }}\" class=\"testimonial-img\" alt=\"\">
                    <h3>Sara Wilsson</h3>
                    <h4>Designer</h4>
                  </div>
                </div><!-- End testimonial item -->

                <div class=\"swiper-slide\">
                  <div class=\"testimonial-item\">
                    <p>
                      <i class=\"bx bxs-quote-alt-left quote-icon-left\"></i>
                      Enim nisi quem export duis labore cillum quae magna enim sint quorum nulla quem veniam duis minim tempor labore quem eram duis noster aute amet eram fore quis sint minim.
                      <i class=\"bx bxs-quote-alt-right quote-icon-right\"></i>
                    </p>
                    <img src=\"{{ asset('assets/img/testimonials/testimonials-3.jpg') }}\" class=\"testimonial-img\" alt=\"\">
                    <h3>Jena Karlis</h3>
                    <h4>Store Owner</h4>
                  </div>
                </div><!-- End testimonial item -->

                <div class=\"swiper-slide\">
                  <div class=\"testimonial-item\">
                    <p>
                      <i class=\"bx bxs-quote-alt-left quote-icon-left\"></i>
                      Fugiat enim eram quae cillum dolore dolor amet nulla culpa multos export minim fugiat minim velit minim dolor enim duis veniam ipsum anim magna sunt elit fore quem dolore labore illum veniam.
                      <i class=\"bx bxs-quote-alt-right quote-icon-right\"></i>
                    </p>
                    <img src=\"{{ asset('assets/img/testimonials/testimonials-4.jpg') }}\" class=\"testimonial-img\" alt=\"\">
                    <h3>Matt Brandon</h3>
                    <h4>Freelancer</h4>
                  </div>
                </div><!-- End testimonial item -->

                <div class=\"swiper-slide\">
                  <div class=\"testimonial-item\">
                    <p>
                      <i class=\"bx bxs-quote-alt-left quote-icon-left\"></i>
                      Quis quorum aliqua sint quem legam fore sunt eram irure aliqua veniam tempor noster veniam enim culpa labore duis sunt culpa nulla illum cillum fugiat legam esse veniam culpa fore nisi cillum quid.
                      <i class=\"bx bxs-quote-alt-right quote-icon-right\"></i>
                    </p>
                    <img src=\"{{ asset('assets/img/testimonials/testimonials-5.jpg') }}\" class=\"testimonial-img\" alt=\"\">
                    <h3>John Larson</h3>
                    <h4>Entrepreneur</h4>
                  </div>
                </div><!-- End testimonial item -->

              </div>
              <div class=\"swiper-pagination\"></div>
            </div>
          </div>
        </div>

      </div>
    </section><!-- End Testimonials Section -->

    <!-- ======= Team Section ======= -->
    <section id=\"team\" class=\"team\">
      <div class=\"container\">

        <div class=\"row\">
          <div class=\"col-lg-4\">
            <div class=\"section-title\" data-aos=\"fade-right\">
              <h2>Team</h2>
              <p>Necessitatibus eius consequatur ex aliquid fuga eum quidem.</p>
            </div>
          </div>
          <div class=\"col-lg-8\">
            <div class=\"row\">

              <div class=\"col-lg-6\">
                <div class=\"member\" data-aos=\"zoom-in\" data-aos-delay=\"100\">
                  <div class=\"pic\"><img src=\"{{ asset('assets/img/team/team-1.jpg') }}\" class=\"img-fluid\" alt=\"\"></div>
                  <div class=\"member-info\">
                    <h4>Walter White</h4>
                    <span>Chief Executive Officer</span>
                    <p>Explicabo voluptatem mollitia et repellat qui dolorum quasi</p>
                    <div class=\"social\">
                      <a href=\"\"><i class=\"ri-twitter-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-facebook-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-instagram-fill\"></i></a>
                      <a href=\"\"> <i class=\"ri-linkedin-box-fill\"></i> </a>
                    </div>
                  </div>
                </div>
              </div>

              <div class=\"col-lg-6 mt-4 mt-lg-0\">
                <div class=\"member\" data-aos=\"zoom-in\" data-aos-delay=\"200\">
                  <div class=\"pic\"><img src=\"{{ asset('assets/img/team/team-2.jpg') }}\" class=\"img-fluid\" alt=\"\"></div>
                  <div class=\"member-info\">
                    <h4>Sarah Jhonson</h4>
                    <span>Product Manager</span>
                    <p>Aut maiores voluptates amet et quis praesentium qui senda para</p>
                    <div class=\"social\">
                      <a href=\"\"><i class=\"ri-twitter-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-facebook-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-instagram-fill\"></i></a>
                      <a href=\"\"> <i class=\"ri-linkedin-box-fill\"></i> </a>
                    </div>
                  </div>
                </div>
              </div>

              <div class=\"col-lg-6 mt-4\">
                <div class=\"member\" data-aos=\"zoom-in\" data-aos-delay=\"300\">
                  <div class=\"pic\"><img src=\"{{ asset('assets/img/team/team-3.jpg') }}\" class=\"img-fluid\" alt=\"\"></div>
                  <div class=\"member-info\">
                    <h4>William Anderson</h4>
                    <span>CTO</span>
                    <p>Quisquam facilis cum velit laborum corrupti fuga rerum quia</p>
                    <div class=\"social\">
                      <a href=\"\"><i class=\"ri-twitter-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-facebook-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-instagram-fill\"></i></a>
                      <a href=\"\"> <i class=\"ri-linkedin-box-fill\"></i> </a>
                    </div>
                  </div>
                </div>
              </div>

              <div class=\"col-lg-6 mt-4\">
                <div class=\"member\" data-aos=\"zoom-in\" data-aos-delay=\"400\">
                  <div class=\"pic\"><img src=\"{{ asset('assets/img/team/team-4.jpg') }}\" class=\"img-fluid\" alt=\"\"></div>
                  <div class=\"member-info\">
                    <h4>Amanda Jepson</h4>
                    <span>Accountant</span>
                    <p>Dolorum tempora officiis odit laborum officiis et et accusamus</p>
                    <div class=\"social\">
                      <a href=\"\"><i class=\"ri-twitter-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-facebook-fill\"></i></a>
                      <a href=\"\"><i class=\"ri-instagram-fill\"></i></a>
                      <a href=\"\"> <i class=\"ri-linkedin-box-fill\"></i> </a>
                    </div>
                  </div>
                </div>
              </div>

            </div>

          </div>
        </div>

      </div>
    </section><!-- End Team Section -->

    <!-- ======= Contact Section ======= -->
    <section id=\"contact\" class=\"contact\">
      <div class=\"container\">
        <div class=\"row\">
          <div class=\"col-lg-4\" data-aos=\"fade-right\">
            <div class=\"section-title\">
              <h2>Contact</h2>
              <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
            </div>
          </div>

          <div class=\"col-lg-8\" data-aos=\"fade-up\" data-aos-delay=\"100\">
            <iframe style=\"border:0; width: 100%; height: 270px;\" src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12097.433213460943!2d-74.0062269!3d40.7101282!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xb89d1fe6bc499443!2sDowntown+Conference+Center!5e0!3m2!1smk!2sbg!4v1539943755621\" frameborder=\"0\" allowfullscreen></iframe>
            <div class=\"info mt-4\">
              <i class=\"bi bi-geo-alt\"></i>
              <h4>Location:</h4>
              <p>A108 Adam Street, New York, NY 535022</p>
            </div>
            <div class=\"row\">
              <div class=\"col-lg-6 mt-4\">
                <div class=\"info\">
                  <i class=\"bi bi-envelope\"></i>
                  <h4>Email:</h4>
                  <p>info@example.com</p>
                </div>
              </div>
              <div class=\"col-lg-6\">
                <div class=\"info w-100 mt-4\">
                  <i class=\"bi bi-phone\"></i>
                  <h4>Call:</h4>
                  <p>+1 5589 55488 55s</p>
                </div>
              </div>
            </div>

            <form action=\"forms/contact.php\" method=\"post\" role=\"form\" class=\"php-email-form mt-4\">
              <div class=\"row\">
                <div class=\"col-md-6 form-group\">
                  <input type=\"text\" name=\"name\" class=\"form-control\" id=\"name\" placeholder=\"Your Name\" required>
                </div>
                <div class=\"col-md-6 form-group mt-3 mt-md-0\">
                  <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Your Email\" required>
                </div>
              </div>
              <div class=\"form-group mt-3\">
                <input type=\"text\" class=\"form-control\" name=\"subject\" id=\"subject\" placeholder=\"Subject\" required>
              </div>
              <div class=\"form-group mt-3\">
                <textarea class=\"form-control\" name=\"message\" rows=\"5\" placeholder=\"Message\" required></textarea>
              </div>
              <div class=\"my-3\">
                <div class=\"loading\">Loading</div>
                <div class=\"error-message\"></div>
                <div class=\"sent-message\">Your message has been sent. Thank you!</div>
              </div>
              <div class=\"text-center\"><button type=\"submit\">Send Message</button></div>
            </form>
          </div>
        </div>

      </div>
    </section><!-- End Contact Section -->

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id=\"footer\">

    <div class=\"footer-top\">
      <div class=\"container\">
        <div class=\"row\">

          <div class=\"col-lg-3 col-md-6 footer-contact\">
            <h3>Bethany</h3>
            <p>
              A108 Adam Street <br>
              New York, NY 535022<br>
              United States <br><br>
              <strong>Phone:</strong> +1 5589 55488 55<br>
              <strong>Email:</strong> info@example.com<br>
            </p>
          </div>

          <div class=\"col-lg-2 col-md-6 footer-links\">
            <h4>Useful Links</h4>
            <ul>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Home</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">About us</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Services</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Terms of service</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Privacy policy</a></li>
            </ul>
          </div>

          <div class=\"col-lg-3 col-md-6 footer-links\">
            <h4>Our Services</h4>
            <ul>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Design</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Development</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Product Management</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Marketing</a></li>
              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Graphic Design</a></li>
            </ul>
          </div>

          <div class=\"col-lg-4 col-md-6 footer-newsletter\">
            <h4>Join Our Newsletter</h4>
            <p>Tamen quem nulla quae legam multos aute sint culpa legam noster magna</p>
            <form action=\"\" method=\"post\">
              <input type=\"email\" name=\"email\"><input type=\"submit\" value=\"Subscribe\">
            </form>
          </div>

        </div>
      </div>
    </div>

    <div class=\"container d-md-flex py-4\">

      <div class=\"me-md-auto text-center text-md-start\">
        <div class=\"copyright\">
          &copy; Copyright <strong><span>Bethany</span></strong>. All Rights Reserved
        </div>
        <div class=\"credits\">
          <!-- All the links in the footer should remain intact. -->
          <!-- You can delete the links only if you purchased the pro version. -->
          <!-- Licensing information: https://bootstrapmade.com/license/ -->
          <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/bethany-free-onepage-bootstrap-theme/ -->
          Designed by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>
        </div>
      </div>
      <div class=\"social-links text-center text-md-right pt-3 pt-md-0\">
        <a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a>
        <a href=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a>
        <a href=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a>
        <a href=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a>
        <a href=\"#\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>
      </div>
    </div>
  </footer><!-- End Footer -->

  <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>

  <!-- Vendor JS Files -->
  <script src=\"{{ asset('assets/vendor/purecounter/purecounter_vanilla.js') }}\"></script>
  <script src=\"{{ asset('assets/vendor/aos/aos.js') }}\"></script>
  <script src=\"{{ asset('assets/vendor/bootstrap/js/bootstrap.bundle.min.js') }}\"></script>
  <script src=\"{{ asset('assets/vendor/glightbox/js/glightbox.min.js') }}\"></script>
  <script src=\"{{ asset('assets/vendor/isotope-layout/isotope.pkgd.min.js') }}\"></script>
  <script src=\"{{ asset('assets/vendor/swiper/swiper-bundle.min.js') }}\"></script>
  <script src=\"{{ asset('assets/vendor/php-email-form/validate.js') }}\"></script>

  <!-- Template Main JS File -->
  <script src=\"{{ asset('assets/js/main.js') }}\"></script>

</body>

</html>", "base.html.twig", "C:\\xampp\\htdocs\\Balha\\templates\\base.html.twig");
    }
}
