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

/* user/index.html.twig */
class __TwigTemplate_d94f8cdee92520aac840dac8c75e32d6 extends Template
{
    private $source;
    private $macros = [];

    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->source = $this->getSourceContext();

        $this->blocks = [
            'title' => [$this, 'block_title'],
            'body' => [$this, 'block_body'],
        ];
    }

    protected function doGetParent(array $context)
    {
        // line 1
        return "back.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_5a27a8ba21ca79b61932376b2fa922d2 = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->enter($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "user/index.html.twig"));

        $__internal_6f47bbe9983af81f1e7450e9a3e3768f = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->enter($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "user/index.html.twig"));

        $this->parent = $this->loadTemplate("back.html.twig", "user/index.html.twig", 1);
        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->leave($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof);

        
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->leave($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof);

    }

    // line 3
    public function block_title($context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_5a27a8ba21ca79b61932376b2fa922d2 = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->enter($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "title"));

        $__internal_6f47bbe9983af81f1e7450e9a3e3768f = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->enter($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "title"));

        echo "User List";
        
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->leave($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof);

        
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->leave($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof);

    }

    // line 5
    public function block_body($context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_5a27a8ba21ca79b61932376b2fa922d2 = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->enter($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_6f47bbe9983af81f1e7450e9a3e3768f = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->enter($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        // line 6
        echo "    
<a href=\"";
        // line 7
        echo $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("bymail");
        echo "\" class=\"nk-btn nk-btn-rounded nk-btn-color-white\"  >
                            <span>Sort By Mail</span>
                            <span class=\"icon\"><i class=\"ion-paper-airplane\"></i></span>
                    </a>
    <a href=\"";
        // line 11
        echo $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("listUserVerified");
        echo "\" class=\"nk-btn nk-btn-rounded nk-btn-color-white\"  >
                            <span>Sort By Verification</span>
                            <span class=\"icon\"><i class=\"ion-paper-airplane\"></i></span>
                    </a>
    <a href=\"";
        // line 15
        echo $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("listUserBanned");
        echo "\" class=\"nk-btn nk-btn-rounded nk-btn-color-white\"  >
                            <span>Sort By Ban Status</span>
                            <span class=\"icon\"><i class=\"ion-paper-airplane\"></i></span>
                    </a>
    <a href=\"";
        // line 19
        echo $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("byusername");
        echo "\" class=\"nk-btn nk-btn-rounded nk-btn-color-white\"  >
                            <span>Sort By Username</span>
                            <span class=\"icon\"><i class=\"ion-paper-airplane\"></i></span>
                    </a>
    <table class=\"table\">
        <thead>
            <tr>
               
                <th>Email</th>
                <th>Roles</th>
                <th>Username</th>
                <th>Fullname</th>
                <th>Naissance</th>
                <th>actions</th>
            </tr>
        </thead>
        <tbody>
        ";
        // line 36
        $context['_parent'] = $context;
        $context['_seq'] = twig_ensure_traversable((isset($context["pagination"]) || array_key_exists("pagination", $context) ? $context["pagination"] : (function () { throw new RuntimeError('Variable "pagination" does not exist.', 36, $this->source); })()));
        $context['_iterated'] = false;
        foreach ($context['_seq'] as $context["_key"] => $context["user"]) {
            // line 37
            echo "            <tr>
                
                <td>";
            // line 39
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["user"], "email", [], "any", false, false, false, 39), "html", null, true);
            echo "</td>
                <td>    ";
            // line 40
            if (twig_in_filter("ROLE_ADMIN", twig_get_attribute($this->env, $this->source, $context["user"], "roles", [], "any", false, false, false, 40))) {
                // line 41
                echo "                            ";
                echo "Admin";
                echo "
                        ";
            } else {
                // line 43
                echo "                            ";
                if (twig_in_filter("ROLE_COLLECTOR", twig_get_attribute($this->env, $this->source, $context["user"], "roles", [], "any", false, false, false, 43))) {
                    // line 44
                    echo "                            ";
                    echo "Collector";
                    echo "
                            ";
                } else {
                    // line 46
                    echo "                            ";
                    echo "User";
                    echo "
                            ";
                }
                // line 48
                echo "                        ";
            }
            // line 49
            echo "                </td>
                <td>";
            // line 50
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["user"], "username", [], "any", false, false, false, 50), "html", null, true);
            echo "</td>
                <td>";
            // line 51
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["user"], "fullname", [], "any", false, false, false, 51), "html", null, true);
            echo "</td>
                <td>";
            // line 52
            ((twig_get_attribute($this->env, $this->source, $context["user"], "naissance", [], "any", false, false, false, 52)) ? (print (twig_escape_filter($this->env, twig_date_format_filter($this->env, twig_get_attribute($this->env, $this->source, $context["user"], "naissance", [], "any", false, false, false, 52), "Y-m-d"), "html", null, true))) : (print ("")));
            echo "</td>
                
                <td>
                    <a href=\"";
            // line 55
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("app_user_show", ["id" => twig_get_attribute($this->env, $this->source, $context["user"], "id", [], "any", false, false, false, 55)]), "html", null, true);
            echo "\">show</a>
                    <a href=\"";
            // line 56
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("app_user_edit", ["id" => twig_get_attribute($this->env, $this->source, $context["user"], "id", [], "any", false, false, false, 56)]), "html", null, true);
            echo "\">edit</a>
                    <a href=\"";
            // line 57
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("app_user_edit_roles", ["id" => twig_get_attribute($this->env, $this->source, $context["user"], "id", [], "any", false, false, false, 57)]), "html", null, true);
            echo "\">edit roles </a>
                    ";
            // line 58
            if (( !twig_test_empty(twig_get_attribute($this->env, $this->source, $context["user"], "isBanned", [], "any", false, false, false, 58)) && twig_get_attribute($this->env, $this->source, $context["user"], "isBanned", [], "any", false, false, false, 58))) {
                // line 59
                echo "


                                    <form method=\"post\" action=\"";
                // line 62
                echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("user_unban", ["id" => twig_get_attribute($this->env, $this->source, $context["user"], "id", [], "any", false, false, false, 62)]), "html", null, true);
                echo "\" onsubmit=\"return confirm('Are you sure you want to unban this User?');\">
                                    <input type=\"hidden\" name=\"_token\" value=\"";
                // line 63
                echo twig_escape_filter($this->env, $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->renderCsrfToken(("unban" . twig_get_attribute($this->env, $this->source, $context["user"], "id", [], "any", false, false, false, 63))), "html", null, true);
                echo "\">
                                    <button class=\"dropdown-item text-danger\"><i class=\"fa fa-trash mr-1\"></i>UnBan</button>
                                    </form>

                                    ";
            } else {
                // line 68
                echo "
                                    <form method=\"post\" action=\"";
                // line 69
                echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("user_ban", ["id" => twig_get_attribute($this->env, $this->source, $context["user"], "id", [], "any", false, false, false, 69)]), "html", null, true);
                echo "\" onsubmit=\"return confirm('Are you sure you want to ban this User?');\">
                                    <input type=\"hidden\" name=\"_token\" value=\"";
                // line 70
                echo twig_escape_filter($this->env, $this->env->getRuntime('Symfony\Component\Form\FormRenderer')->renderCsrfToken(("ban" . twig_get_attribute($this->env, $this->source, $context["user"], "id", [], "any", false, false, false, 70))), "html", null, true);
                echo "\">
                                    <button class=\"dropdown-item text-danger\"><i class=\"fa fa-trash mr-1\"></i>Ban</button>
                                    </form>
                                    ";
            }
            // line 74
            echo "                </td>
            </tr>
        ";
            $context['_iterated'] = true;
        }
        if (!$context['_iterated']) {
            // line 77
            echo "            <tr>
                <td colspan=\"9\">no records found</td>
            </tr>
        ";
        }
        $_parent = $context['_parent'];
        unset($context['_seq'], $context['_iterated'], $context['_key'], $context['user'], $context['_parent'], $context['loop']);
        $context = array_intersect_key($context, $_parent) + $_parent;
        // line 81
        echo "        </tbody>
    </table>
    ";
        // line 83
        echo $this->extensions['Knp\Bundle\PaginatorBundle\Twig\Extension\PaginationExtension']->render($this->env, (isset($context["pagination"]) || array_key_exists("pagination", $context) ? $context["pagination"] : (function () { throw new RuntimeError('Variable "pagination" does not exist.', 83, $this->source); })()));
        echo "

    
";
        
        $__internal_6f47bbe9983af81f1e7450e9a3e3768f->leave($__internal_6f47bbe9983af81f1e7450e9a3e3768f_prof);

        
        $__internal_5a27a8ba21ca79b61932376b2fa922d2->leave($__internal_5a27a8ba21ca79b61932376b2fa922d2_prof);

    }

    public function getTemplateName()
    {
        return "user/index.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  253 => 83,  249 => 81,  240 => 77,  233 => 74,  226 => 70,  222 => 69,  219 => 68,  211 => 63,  207 => 62,  202 => 59,  200 => 58,  196 => 57,  192 => 56,  188 => 55,  182 => 52,  178 => 51,  174 => 50,  171 => 49,  168 => 48,  162 => 46,  156 => 44,  153 => 43,  147 => 41,  145 => 40,  141 => 39,  137 => 37,  132 => 36,  112 => 19,  105 => 15,  98 => 11,  91 => 7,  88 => 6,  78 => 5,  59 => 3,  36 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'back.html.twig' %}

{% block title %}User List{% endblock %}

{% block body %}
    
<a href=\"{{ path('bymail') }}\" class=\"nk-btn nk-btn-rounded nk-btn-color-white\"  >
                            <span>Sort By Mail</span>
                            <span class=\"icon\"><i class=\"ion-paper-airplane\"></i></span>
                    </a>
    <a href=\"{{ path('listUserVerified') }}\" class=\"nk-btn nk-btn-rounded nk-btn-color-white\"  >
                            <span>Sort By Verification</span>
                            <span class=\"icon\"><i class=\"ion-paper-airplane\"></i></span>
                    </a>
    <a href=\"{{ path('listUserBanned') }}\" class=\"nk-btn nk-btn-rounded nk-btn-color-white\"  >
                            <span>Sort By Ban Status</span>
                            <span class=\"icon\"><i class=\"ion-paper-airplane\"></i></span>
                    </a>
    <a href=\"{{ path('byusername') }}\" class=\"nk-btn nk-btn-rounded nk-btn-color-white\"  >
                            <span>Sort By Username</span>
                            <span class=\"icon\"><i class=\"ion-paper-airplane\"></i></span>
                    </a>
    <table class=\"table\">
        <thead>
            <tr>
               
                <th>Email</th>
                <th>Roles</th>
                <th>Username</th>
                <th>Fullname</th>
                <th>Naissance</th>
                <th>actions</th>
            </tr>
        </thead>
        <tbody>
        {% for user in pagination %}
            <tr>
                
                <td>{{ user.email }}</td>
                <td>    {% if 'ROLE_ADMIN' in user.roles %}
                            {{\"Admin\"}}
                        {% else %}
                            {% if 'ROLE_COLLECTOR' in user.roles %}
                            {{\"Collector\"}}
                            {% else %}
                            {{\"User\"}}
                            {% endif %}
                        {% endif %}
                </td>
                <td>{{ user.username }}</td>
                <td>{{ user.fullname }}</td>
                <td>{{ user.naissance ? user.naissance|date('Y-m-d') : '' }}</td>
                
                <td>
                    <a href=\"{{ path('app_user_show', {'id': user.id}) }}\">show</a>
                    <a href=\"{{ path('app_user_edit', {'id': user.id}) }}\">edit</a>
                    <a href=\"{{ path('app_user_edit_roles', {'id': user.id}) }}\">edit roles </a>
                    {% if user.isBanned is not empty and user.isBanned %}



                                    <form method=\"post\" action=\"{{ path('user_unban', {'id': user.id}) }}\" onsubmit=\"return confirm('Are you sure you want to unban this User?');\">
                                    <input type=\"hidden\" name=\"_token\" value=\"{{ csrf_token('unban' ~ user.id) }}\">
                                    <button class=\"dropdown-item text-danger\"><i class=\"fa fa-trash mr-1\"></i>UnBan</button>
                                    </form>

                                    {% else %}

                                    <form method=\"post\" action=\"{{ path('user_ban', {'id': user.id}) }}\" onsubmit=\"return confirm('Are you sure you want to ban this User?');\">
                                    <input type=\"hidden\" name=\"_token\" value=\"{{ csrf_token('ban' ~ user.id) }}\">
                                    <button class=\"dropdown-item text-danger\"><i class=\"fa fa-trash mr-1\"></i>Ban</button>
                                    </form>
                                    {% endif %}
                </td>
            </tr>
        {% else %}
            <tr>
                <td colspan=\"9\">no records found</td>
            </tr>
        {% endfor %}
        </tbody>
    </table>
    {{ knp_pagination_render(pagination) }}

    
{% endblock %}
", "user/index.html.twig", "C:\\xampp\\htdocs\\Balha\\templates\\user\\index.html.twig");
    }
}
