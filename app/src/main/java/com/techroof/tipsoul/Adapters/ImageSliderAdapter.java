package com.techroof.tipsoul.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderViewAdapter;
import com.techroof.tipsoul.Model.CardItemData;
import com.techroof.tipsoul.R;

import java.util.List;

public class ImageSliderAdapter extends SliderViewAdapter<SliderViewHolder> {

    Context context;
    List<CardItemData> imageSliderModelList;

    public ImageSliderAdapter(Context context, List<CardItemData> imageSliderModelList) {
        this.context = context;
        this.imageSliderModelList = imageSliderModelList;
    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_list, parent, false);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {
        viewHolder.sliderImageView.setImageResource(imageSliderModelList.get(position).getPic());
    }

    @Override
    public int getCount() {
        return imageSliderModelList.size();
    }
}

class SliderViewHolder extends SliderViewAdapter.ViewHolder
{
    ImageView sliderImageView;
    TextView sliderTextView;
    public SliderViewHolder(View itemView) {
        super(itemView);
        sliderImageView = itemView.findViewById(R.id.imageView);
        sliderTextView = itemView.findViewById(R.id.textView);
    }
}
