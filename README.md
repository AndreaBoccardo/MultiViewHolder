# MultiViewHolder
Implementar RecyclerView con MultiViewHolder

Descripción
Descarga y abre la aplicación de apoyo al Desafío llamada "RecyclerView Multi ViewHolder"
en Android Studio, Revisar su contenido:
● Esta aplicación muestra en un RecyclerView un dataSet estático.
● Existen dos ViewHolder, uno para datos con imágenes y otro sin ellas.

HINT: se construyó de 0 la aplicación, usando tan solo las imágenes y string otorgados en el archivo mencionado

Requerimientos
1. Implementar las modificaciones necesarias en para que se pueda visualizar los dos
nuevos tipos de vistas, para tener un total de 4 tipos de vistas en el RecyclerView.
2. La selección del ViewHolder necesario debe hacerse por el atributo boolean de los
datos estáticos, es decir (isHeader, isFooter, withoutImage, withImage ).

Instrucciones
1. Crear un archivo item_list_header.xml con un textview con id y textcolor
@color/darkGray, el cual representa los Items que tengan esta descripción
(HEADER).
2. Crear un archivo item_list_footer.xml con un view horizontal con height de 2dp y
background color @color/darkGray, el cual representará los Items que tengan esta
descripción (FOOTER).
3. Declarar las nuevas constantes HEADER y FOOTER para manejar dos nuevos tipos
de vistas, al igual que se manejaba "NORMAL_WITH_IMAGE" o
"NORMAL_WITHOUT_IMAGE".
4. Incluir en el método getItemViewType(int position) el header y el footer.
5. Incluir en el método onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) el
header y el footer.
6. Incluir en el método onBindViewHolder(@NonNull RecyclerView.ViewHolder
viewHolder, int i) el header y el footer.
7. Modificar los archivos item_list_with_image.xml y item_list_without_image.xml para
que sean unos cardview, con elevación de 5dp y radio de 5dp.
