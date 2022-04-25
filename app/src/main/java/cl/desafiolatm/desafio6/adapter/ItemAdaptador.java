package cl.desafiolatm.desafio6.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.desafiolatm.desafio6.R;
import cl.desafiolatm.desafio6.databinding.ItemHeaderBinding;
import cl.desafiolatm.desafio6.databinding.ItemImgBinding;
import cl.desafiolatm.desafio6.databinding.ItemNoImgBinding;
import cl.desafiolatm.desafio6.modelo.Item;

public class ItemAdaptador extends RecyclerView.Adapter<ItemAdaptador.BaseViewHolder>{

    private List<Item> lista;

    public ItemAdaptador(List<Item> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        switch (viewType){
            case 1:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_header,parent,false);
                return new HeaderViewHolder(v);
            case 2:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_img,parent,false);
                return new ImgViewHolder(v);
            case 3:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_no_img,parent,false);
                return  new NoImgViewHolder(v);
            default:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_footer,parent,false);
                return new Footer(v);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.bindData(lista.get(position));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    @Override
    public int getItemViewType(int position) {
        return lista.get(position).getTipo().ordinal();
    }

    abstract class BaseViewHolder extends RecyclerView.ViewHolder{
        public BaseViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        public abstract void bindData(Item item);
    }

    class HeaderViewHolder extends  BaseViewHolder{
        private ItemHeaderBinding b;
        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            b = ItemHeaderBinding.bind(itemView);
        }

        @Override
        public void bindData(Item item) {
            b.tvHeader.setText(item.getMensaje());
        }
    }

    class ImgViewHolder extends BaseViewHolder{
        private ItemImgBinding b;
        public ImgViewHolder(@NonNull View itemView) {
            super(itemView);
            b = ItemImgBinding.bind(itemView);
        }

        @Override
        public void bindData(Item item) {
            b.tvMensaje.setText(item.getMensaje());
            b.tvHoraImg.setText(item.getHora());
            b.ivImg.setImageResource(item.getImagen());
        }
    }

    class NoImgViewHolder extends BaseViewHolder{
        private ItemNoImgBinding b;
        public NoImgViewHolder(@NonNull View itemView) {
            super(itemView);
            b = ItemNoImgBinding.bind(itemView);
        }

        @Override
        public void bindData(Item item) {
            b.tvContenido.setText(item.getMensaje());
            b.tvHora.setText(item.getHora());
        }
    }

    class Footer extends BaseViewHolder{
        public Footer(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        public void bindData(Item item) {
        }
    }
}

