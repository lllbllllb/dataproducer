This soap DateWebService interface was created for only one purpose: provide current date and time through two methods:

- public LocalDateTime getDate(), which the return LocalDateTime object
- public String getStringDate(), which the return String formatted ("yyyy-MM-dd HH:mm") object

For example this app <linl>https://github.com/lllbllllb/vieworders</link> get date from this DateWebService.

Technology:
- Apache CXF (implementation JAX-WS API)
- Spring MVC (using only for run application and user-friendly description of the SOAP web service)
