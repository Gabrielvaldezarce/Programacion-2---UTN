/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1. Agregar productos
        inv.agregarProducto(new Producto("P1", "Arroz", 800, 50, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P2", "Televisor", 150000, 10, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P3", "Remera", 3500, 30, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P4", "Sillon", 95000, 5, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P5", "Fideos", 700, 80, CategoriaProducto.ALIMENTOS));

        System.out.println("\n--- LISTADO DE PRODUCTOS ---");
        inv.listarProductos();

        System.out.println("\n--- BUSCAR PRODUCTO P3 ---");
        Producto encontrado = inv.buscarProductoPorId("P3");
        if (encontrado != null) encontrado.mostrarInfo();

        System.out.println("\n--- FILTRAR POR CATEGORIA ALIMENTOS ---");
        inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("\n--- ELIMINAR PRODUCTO P4 ---");
        inv.eliminarProducto("P4");
        inv.listarProductos();

        System.out.println("\n--- ACTUALIZAR STOCK P2 ---");
        inv.actualizarStock("P2", 15);
        inv.listarProductos();

        System.out.println("\nTotal de stock: " + inv.obtenerTotalStock());

        System.out.println("\nProducto con mayor stock:");
        inv.obtenerProductoConMayorStock().mostrarInfo();

        System.out.println("\nProductos entre $1000 y $3000:");
        inv.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\nCategorias disponibles:");
        inv.mostrarCategoriasDisponibles();
    }
}
