package biomesoplenty.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWasp extends ModelBase
{
    //fields
    ModelRenderer Thorax;
    ModelRenderer Abdomen;
    ModelRenderer Stinger;
    ModelRenderer Left_Leg_Back;
    ModelRenderer Left_Leg_Middle;
    ModelRenderer Left_Leg_Front;
    ModelRenderer Right_Leg_Back;
    ModelRenderer Right_Leg_Middle;
    ModelRenderer Right_Leg_Front;
    ModelRenderer Left_Wing;
    ModelRenderer Right_Wing;
    ModelRenderer Head;
    ModelRenderer Nose;
    ModelRenderer Left_Antenna;
    ModelRenderer Right_Antenna;

    public ModelWasp()
    {
        textureWidth = 64;
        textureHeight = 32;

        Thorax = new ModelRenderer(this, 0, 0);
        Thorax.addBox(0F, 0F, 0F, 5, 5, 8);
        Thorax.setRotationPoint(0F, 0F, 0F);
        Thorax.setTextureSize(64, 32);
        Thorax.mirror = true;
        setRotation(Thorax, 0F, 0F, 0F);
        Abdomen = new ModelRenderer(this, 0, 13);
        Abdomen.addBox(0F, 0F, 0F, 3, 3, 2);
        Abdomen.setRotationPoint(1F, 2F, -2F);
        Abdomen.setTextureSize(64, 32);
        Abdomen.mirror = true;
        setRotation(Abdomen, 0F, 0F, 0F);
        Stinger = new ModelRenderer(this, 0, 18);
        Stinger.addBox(0F, 0F, 0F, 1, 1, 3);
        Stinger.setRotationPoint(2F, 4F, -5F);
        Stinger.setTextureSize(64, 32);
        Stinger.mirror = true;
        setRotation(Stinger, 0F, 0F, 0F);
        Left_Leg_Back = new ModelRenderer(this, 13, 23);
        Left_Leg_Back.addBox(0F, 0F, 0F, 1, 4, 1);
        Left_Leg_Back.setRotationPoint(-1F, 4F, 1F);
        Left_Leg_Back.setTextureSize(64, 32);
        Left_Leg_Back.mirror = true;
        setRotation(Left_Leg_Back, 0F, 0F, 0F);
        Left_Leg_Middle = new ModelRenderer(this, 13, 23);
        Left_Leg_Middle.addBox(0F, 0F, 0F, 1, 3, 1);
        Left_Leg_Middle.setRotationPoint(-1F, 4F, 4F);
        Left_Leg_Middle.setTextureSize(64, 32);
        Left_Leg_Middle.mirror = true;
        setRotation(Left_Leg_Middle, 0F, 0F, 0F);
        Left_Leg_Front = new ModelRenderer(this, 13, 23);
        Left_Leg_Front.addBox(0F, 0F, 0F, 1, 4, 1);
        Left_Leg_Front.setRotationPoint(-1F, 4F, 6F);
        Left_Leg_Front.setTextureSize(64, 32);
        Left_Leg_Front.mirror = true;
        setRotation(Left_Leg_Front, 0F, 0F, 0F);
        Right_Leg_Back = new ModelRenderer(this, 13, 23);
        Right_Leg_Back.addBox(0F, 0F, 0F, 1, 4, 1);
        Right_Leg_Back.setRotationPoint(5F, 4F, 1F);
        Right_Leg_Back.setTextureSize(64, 32);
        Right_Leg_Back.mirror = true;
        setRotation(Right_Leg_Back, 0F, 0F, 0F);
        Right_Leg_Middle = new ModelRenderer(this, 13, 23);
        Right_Leg_Middle.addBox(0F, 0F, 0F, 1, 3, 1);
        Right_Leg_Middle.setRotationPoint(5F, 4F, 4F);
        Right_Leg_Middle.setTextureSize(64, 32);
        Right_Leg_Middle.mirror = true;
        setRotation(Right_Leg_Middle, 0F, 0F, 0F);
        Right_Leg_Front = new ModelRenderer(this, 13, 23);
        Right_Leg_Front.addBox(0F, 0F, 0F, 1, 4, 1);
        Right_Leg_Front.setRotationPoint(5F, 4F, 6F);
        Right_Leg_Front.setTextureSize(64, 32);
        Right_Leg_Front.mirror = true;
        setRotation(Right_Leg_Front, 0F, 0F, 0F);
        Left_Wing = new ModelRenderer(this, 24, 26);
        Left_Wing.addBox(0F, 0F, 0F, 8, 1, 5);
        Left_Wing.setRotationPoint(-7F, -1F, 2F);
        Left_Wing.setTextureSize(64, 32);
        Left_Wing.mirror = true;
        setRotation(Left_Wing, 0F, 0F, 0F);
        Right_Wing = new ModelRenderer(this, 24, 20);
        Right_Wing.addBox(0F, 0F, 0F, 8, 1, 5);
        Right_Wing.setRotationPoint(4F, -1F, 2F);
        Right_Wing.setTextureSize(64, 32);
        Right_Wing.mirror = true;
        setRotation(Right_Wing, 0F, 0F, 0F);
        Head = new ModelRenderer(this, 46, 0);
        Head.addBox(0F, 0F, 0F, 5, 5, 4);
        Head.setRotationPoint(0F, -2F, 8F);
        Head.setTextureSize(64, 32);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Nose = new ModelRenderer(this, 54, 9);
        Nose.addBox(0F, 0F, 0F, 3, 4, 2);
        Nose.setRotationPoint(1F, 0F, 11F);
        Nose.setTextureSize(64, 32);
        Nose.mirror = true;
        setRotation(Nose, 0F, 0F, 0F);
        Left_Antenna = new ModelRenderer(this, 54, 27);
        Left_Antenna.addBox(0F, 0F, 0F, 1, 1, 4);
        Left_Antenna.setRotationPoint(1F, -3F, 10F);
        Left_Antenna.setTextureSize(64, 32);
        Left_Antenna.mirror = true;
        setRotation(Left_Antenna, 0F, 0F, 0F);
        Right_Antenna = new ModelRenderer(this, 54, 27);
        Right_Antenna.addBox(0F, 0F, 0F, 1, 1, 4);
        Right_Antenna.setRotationPoint(3F, -3F, 10F);
        Right_Antenna.setTextureSize(64, 32);
        Right_Antenna.mirror = true;
        setRotation(Right_Antenna, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Thorax.render(f5);
        Abdomen.render(f5);
        Stinger.render(f5);
        Left_Leg_Back.render(f5);
        Left_Leg_Middle.render(f5);
        Left_Leg_Front.render(f5);
        Right_Leg_Back.render(f5);
        Right_Leg_Middle.render(f5);
        Right_Leg_Front.render(f5);
        Left_Wing.render(f5);
        Right_Wing.render(f5);
        Head.render(f5);
        Nose.render(f5);
        Left_Antenna.render(f5);
        Right_Antenna.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity); 
    }
}
